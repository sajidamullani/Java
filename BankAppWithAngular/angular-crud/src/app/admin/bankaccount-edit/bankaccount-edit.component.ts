import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { BankAccountService } from 'src/app/services/bankaccount.service';

@Component({
  selector: 'app-bankaccount-edit',
  templateUrl: './bankaccount-edit.component.html',
  styleUrls: ['./bankaccount-edit.component.css']
})
export class BankAccountEditComponent implements OnInit {

  form: FormGroup;
  id: number;

  constructor(
    private formBuilder: FormBuilder,
    private route:ActivatedRoute,
    private bankaccountService: BankAccountService,
    private router: Router
    ) {
    this.form = this.formBuilder.group({
      accNo: '',
      accName: '',
      balance:''
    })

    this.id = parseInt(this.route.snapshot.params.id);

    this.bankaccountService.get(this.id).subscribe(
      bankaccount => this.form.patchValue(bankaccount)
    )

   }

  ngOnInit(): void {

  }

  submit(): void {
    this.bankaccountService.update(this.id, this.form.getRawValue()).subscribe(
      () => {
        this.router.navigate(['/admin/bankaccounts'])
      }
    )
  }

}

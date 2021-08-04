import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BankAccountService } from 'src/app/services/bankaccount.service';

@Component({
  selector: 'app-bankaccount-create',
  templateUrl: './bankaccount-create.component.html',
  styleUrls: ['./bankaccount-create.component.css']
})
export class BankAccountCreateComponent implements OnInit {

  accNo = '';
  accName ='';
 balance='';
  
  constructor(
    private bankaccountService: BankAccountService,
    private router: Router
    ) {   

  }

  ngOnInit(): void {
    
  }

  submit(): void {

    const data = {
      accNo: this.accNo,
    accName: this.accName,
      balance : this.balance
      
    }
    
    this.bankaccountService.create(data).subscribe(
      () => {
        this.router.navigate(['/admin/bankaccounts'])
      }
    )
  }

}

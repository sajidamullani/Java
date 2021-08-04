import { Component, OnInit } from '@angular/core';
import { BankAccount } from 'src/app/interfaces/bankaccount';
import { BankAccountService } from 'src/app/services/bankaccount.service';

@Component({
  selector: 'app-bankaccounts',
  templateUrl: './bankaccounts.component.html',
  styleUrls: ['./bankaccounts.component.css']
})
export class BankAccountsComponent implements OnInit {

  bankaccounts: BankAccount[] = []

  constructor(private bankaccountService: BankAccountService) { }

  ngOnInit(): void {
    this.bankaccountService.all().subscribe(
      bankaccounts => {
        this.bankaccounts = bankaccounts
      }
    )
  }

  bankaccountDel(Id: number): void {
    this.bankaccountService.delete(Id).subscribe(
      () => {
        this.bankaccounts = this.bankaccounts.filter( p => p.id !== Id );
        window.location.reload();
      }
    )
  }

}

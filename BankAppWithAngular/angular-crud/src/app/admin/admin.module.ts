import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AdminComponent } from './admin.component';
import { MenuComponent } from './menu/menu.component';
import { NavComponent } from './nav/nav.component';
import { BankAccountsComponent } from './bankaccounts/bankaccounts.component';
import { BankAccountCreateComponent } from './bankaccount-create/bankaccount-create.component';
import { BankAccountEditComponent } from './bankaccount-edit/bankaccount-edit.component';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AdminComponent,
    MenuComponent,
    NavComponent,
    BankAccountsComponent,
    BankAccountCreateComponent,
    BankAccountEditComponent,
    BankAccountCreateComponent,
    BankAccountEditComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class AdminModule { }

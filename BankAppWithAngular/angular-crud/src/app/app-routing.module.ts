import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { BankAccountCreateComponent } from './admin/bankaccount-create/bankaccount-create.component';
import { BankAccountEditComponent } from './admin/bankaccount-edit/bankaccount-edit.component';

import { BankAccountsComponent } from './admin/bankaccounts/bankaccounts.component';
import { MainComponent } from './main/main.component';

const routes: Routes = [
  {
    path: '', component: MainComponent
  },
  {
    path: 'admin', component: AdminComponent,
    children: [
      {
        path: 'bankaccounts',component:BankAccountsComponent
      },
      {
        path: 'bankaccounts/create',component:BankAccountCreateComponent
      },
      {
        path: 'bankaccounts/:id/edit',component:BankAccountEditComponent
      }
      
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }



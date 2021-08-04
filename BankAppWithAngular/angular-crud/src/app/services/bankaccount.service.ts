import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { BankAccount } from '../interfaces/bankaccount';

@Injectable(
  {
    providedIn: 'root'
  })

export class BankAccountService {

  apiUrl = 'http://localhost:8080/api/bankaccounts'

  constructor(private http: HttpClient) {}

  all(): Observable<BankAccount[]> {
    return this.http.get<BankAccount[]>(this.apiUrl)
  }
  
  create(data:any):Observable<BankAccount[]>{
    return this.http.post<BankAccount[]>(this.apiUrl,data)
  }

  get(id: number): Observable<BankAccount> {
    return this.http.get<BankAccount>(`${this.apiUrl}/${id}`)
  }

  update(id: number, data: any): Observable<BankAccount> {
    return this.http.put<BankAccount>(`${this.apiUrl}/${id}`, data)
  }
  delete(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`)
  }

  }
 
  

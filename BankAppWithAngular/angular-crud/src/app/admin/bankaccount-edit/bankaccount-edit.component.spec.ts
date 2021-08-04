import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BankAccountEditComponent } from './bankaccount-edit.component';

describe('BankAccountEditComponent', () => {
  let component: BankAccountEditComponent;
  let fixture: ComponentFixture<BankAccountEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BankAccountEditComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BankAccountEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

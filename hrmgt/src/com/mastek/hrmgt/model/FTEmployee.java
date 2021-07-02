package com.mastek.hrmgt.model;

public class FTEmployee extends Employee
{
 private double empSalary;
	public FTEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FTEmployee(int eno, String ename, String designation,double empSalary) {
		super(eno, ename, designation);

		// TODO Auto-generated constructor stub
		setEmpSalary(empSalary);
		
	}
	public void setEmpSalary(double empSalary ){
		
		if(empSalary>=0.0)
		{
			this.empSalary=empSalary;
		}
	}

	public double getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return "FTEmployee [empSalary=" + empSalary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(empSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FTEmployee other = (FTEmployee) obj;
		if (Double.doubleToLongBits(empSalary) != Double.doubleToLongBits(other.empSalary))
			return false;
		return true;
	}
	
	//public void display()
//	//	System.out.println("Employee Number:"+Eno);
	//}
	}

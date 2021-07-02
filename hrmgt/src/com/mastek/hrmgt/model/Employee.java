package com.mastek.hrmgt.model;

public class Employee {
	private int Eno;
	private String ename;
	private String Designation;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eno, String ename, String designation) {
		super();
		this.Eno = eno;
		this.ename = ename;
		this.Designation = designation;
	}
	public int getEno() {
		return Eno;
	}
	public void setEno(int eno) {
		Eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [Eno=" + Eno + ", ename=" + ename + ", Designation=" + Designation + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Designation == null) ? 0 : Designation.hashCode());
		result = prime * result + Eno;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Designation == null) {
			if (other.Designation != null)
				return false;
		} else if (!Designation.equals(other.Designation))
			return false;
		if (Eno != other.Eno)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		return true;
	}
	

}

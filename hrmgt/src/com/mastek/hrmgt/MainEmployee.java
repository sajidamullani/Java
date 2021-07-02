package com.mastek.hrmgt;

import com.mastek.hrmgt.model.Employee;
import com.mastek.hrmgt.model.FTEmployee;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			//Employee emp=new Employee(14947,"Sajida","Software Engineer");
			FTEmployee emp2= new FTEmployee(14948,"Sajida","Software Engineer",28000);
			System.out.println("Empoyee Number: "+emp2.getEno()+" Employee Name : "+emp2.getEname()+"Employee Designation: "+emp2.getDesignation()+"Employee Salary:"+emp2.getEmpSalary());
			
			
			
			
			
			

	}

}

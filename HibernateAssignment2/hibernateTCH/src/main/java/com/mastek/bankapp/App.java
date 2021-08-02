package com.mastek.bankapp;



import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mastek.bankapp.model.SalaryAccount;
import com.mastek.bankapp.model.SavingAccount;  



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	          
	        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	        Session session=factory.openSession();  
	          
	         Transaction t=session.beginTransaction();    
	            
   
	            
	                
	           SavingAccount e2=new  SavingAccount();    
	            e2.setAccName("Vivek Kumar");    
	              
	                
	            SalaryAccount e3=new  SalaryAccount();    
	             
	            e3.setBalance(10000);    
	              
	                
	            session.persist(e2);    
	            session.persist(e3);    
	                
	            t.commit();    
	            session.close();    
	            System.out.println("success");        
	    
		

	}
}

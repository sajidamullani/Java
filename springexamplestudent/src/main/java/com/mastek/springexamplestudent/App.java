package com.mastek.springexamplestudent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mastek.springexamplestudent.model.Profile;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Profile profile = (Profile) context.getBean("profile");
       // System.out.println(profile.printAge());
        //System.out.println(profile.printName());
        profile.printAge();
        profile.printName();
        
    }
}

package com.you;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println( "Project Started......." );
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
	    Student data = (Student)session.get(Student.class, 2);
	    System.out.println(data);
	    //System.out.println(data.getId() + " " +data.getName()+" "+ data.getCity() );
	    Student data2 = (Student)session.get(Student.class, 2);
	    System.out.println(data2);
	    
		

	    Student data1 = (Student)session.load(Student.class, 1);
	    //System.out.println(data1.getId() + " " +data1.getName()+" "+ data1.getCity() );
		
	    
		session.close();
		factory.close();
		
		
	}
		
	
}

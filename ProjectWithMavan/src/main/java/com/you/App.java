package com.you;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Project Started......." );
    	
    	Configuration cfg = new Configuration();
    	
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	Student st = new Student();
    	
    	/*
    	st.setId(1);
    	st.setName("Natha");
    	st.setCity("Kutiyana");
    	*/
    	
    	st.setId(3);
    	st.setName("Aniket");
    	st.setCity("Ahmedabad");
    	
    	System.out.println(st);
    	
    	Session session = factory.openSession();
    	
    	Transaction tr = session.beginTransaction();
    	
    	session.save(st);
   
    	tr.commit();
    	
    	session.close();
    	
    }
}

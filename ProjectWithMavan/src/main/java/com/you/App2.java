package com.you;

import java.io.FileInputStream;
import java.io.IOException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {

public static void main(String[] args) throws IOException {
	
	
	System.out.println( "Project Started......." );
	
	Configuration cfg = new Configuration();
	
	cfg.configure("hibernate.cfg.xml");
	
	SessionFactory factory = cfg.buildSessionFactory();
	
	StudentExtraData ste = new StudentExtraData();
	
	ste.setId(181);
	ste.setName("Bhavik");
	ste.setSurname("Modhvadiya");
	ste.setFathername("IDK");
	ste.setAge(20);
	ste.setMobileno("7226036326");
	ste.setGender("Male");
	ste.setAddress("Modhvada");
	ste.setCity("Porbandar");
	ste.setBloodgroop("O-");

	
	FileInputStream fim = new FileInputStream("src/main/java/3.jpg");
	byte[] data = new byte[fim.available()];
	fim.read(data);
	ste.setImage(data);
	
	System.out.println(ste);
	
	
	Session session = factory.openSession();
	
	Transaction tr = session.beginTransaction();
	
	session.save(ste);

	tr.commit();
	
	session.close();
	
}
	
}

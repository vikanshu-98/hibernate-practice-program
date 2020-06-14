package com.org.person;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Person ob1=new Person(12,"vikanshu","baghpat");
		session.beginTransaction();
		session.save(ob1);
		session.getTransaction().commit();
		
session.close();
	}

}

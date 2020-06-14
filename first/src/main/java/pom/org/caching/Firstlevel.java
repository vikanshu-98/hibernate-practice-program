package pom.org.caching;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import pom.org.first.Student;
public class Firstlevel {

	public static void main(String[] args) {
	 
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session sesion=factory.openSession();
		//first level cache use 
 Student onb=sesion.get(Student.class, 0);
 System.out.println(onb);
Student ob1=sesion.get(Student.class, 0);
System.out.println(ob1);
		
		
		
		
		sesion.close();
factory.close();
	}

}

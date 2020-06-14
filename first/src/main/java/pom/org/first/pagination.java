package pom.org.first;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;

import java.util.List;

import org.hibernate.Session;
public class pagination {

	public static void main(String args[])
	{
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	  Session session=factory.openSession();
Query query=	    session.createQuery("from Student");
//query.setHibernateFirstResult
	   query.setHibernateFirstResult(1);
	//setMaxResults
	   query.setMaxResults(2);
	   List<Student >l=query.list();
	   for(Student s:l) {
		   System.out.println(s);
		   
	   }
	   
	 
	 
   
		
		session.clear();
	factory.close();	
	}
	
	
}

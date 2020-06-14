package pom.org.sql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;


public class SqlQuery {

	public static void main(String[] args) {
	 SessionFactory factory=new Configuration().configure().buildSessionFactory();
	 Session session=factory.openSession();
	 NativeQuery query  = session.createSQLQuery("select * from student");
	 List<Object[] >li=query.list();
	  for(Object[] Ob:li) 
	  {
		  System.out.println(Arrays.toString(Ob));
		  
	  }
		
		
		
	factory.close();	
	}

}

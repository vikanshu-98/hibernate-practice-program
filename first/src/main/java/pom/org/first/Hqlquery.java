package pom.org.first;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hqlquery {

	public static void main(String[] args) {
	 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    Session session=factory.openSession();
    String s="from Student where Address=:v";

    Query  query=session.createQuery(s);
    query.setParameter("v", "ghaziabad");
    List<Student>list=query.list();
    for (Student st:list) {
    	System.out.println(st.getName());
    }
    	//delete'
  // String string="delete  from Student as s where s.name=:n";
   //session.beginTransaction();
   //Query query1=session.createQuery(string);
   //query1.setParameter("n", "vikas");
   //int i=query1.executeUpdate();
   //System.out.println("deleted "+" "+i);
   //session.getTransaction().commit();
    	
    //updated the value
 String string="update Student as  s set s.Address=:b where s.name=:i";
 
 session.beginTransaction();
 Query query1=session.createQuery(string);
 query1.setParameter("b","bagphat");
 query1.setParameter("i", "ramesh");
 int i=query1.executeUpdate();
 session.getTransaction().commit();
 System.out.println(i);
 
 
    
    
    
    
	session.close();
	
	factory.close();
	}

}

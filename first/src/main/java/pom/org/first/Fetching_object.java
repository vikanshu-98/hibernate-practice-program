package pom.org.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetching_object {
public static void main(String Args[]) {
   Configuration conf=new Configuration();
   conf.configure();
   SessionFactory fatory=conf.buildSessionFactory();
  Session session= fatory.openSession();
  //get
	Student student =(Student)session.get(Student.class, 1);
 System.out.println(student);
  Student st =(Student)session.get(Student.class, 1);
System.out.println(st);

//load method
 student_address add=(student_address)session.load(student_address.class,2);
 System.out.println(add.getStreet());
 
 session.close();
fatory.close();
}
}
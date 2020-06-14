package pom.org.first;

 import java.io.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 

  

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException
    {
    	
  Configuration conf=new Configuration();
   conf.configure("hibernate.cfg.xml");
   SessionFactory factory=conf.buildSessionFactory();
 //Student detail
   Student at=new Student();
   at.setId(6);
   at.setName("ramesh");
   at.setAddress("ghaziabad");
  Certificate certificate=new Certificate();
  certificate.setCertificate_id(148);
  certificate.setCourse("python");
  certificate.setDuration("2 month");
   at.setCertificate(certificate);
   
   
   
 
//Address of student
student_address add=new student_address();
add.setStreet("duhai");
add.setIsopen(true);
add.setAdddate(new Date());
FileInputStream fn=new FileInputStream("src/main/java/1.jpg");
byte[] rd=new byte[fn.available()];
fn.read(rd);
add.setImage(rd);
 
 //opening session
Session session= factory.openSession();
 Transaction tran= session.beginTransaction();
 session.save(at);
 session.save(add);
 
 tran.commit();
 session.close();
 factory.close();
    }
}

package ppm.org.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
//import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;
import pom.org.first.*;
public class secondlevel {

	public static void main(String[] args) {
	 //EhcacheReCahcheRgionFactory

	 SessionFactory factory = new Configuration().configure().buildSessionFactory();
	 Session session1 = factory.openSession();
	Student st1=session1.get(Student.class, 0);
	System.out.println(st1);
	 session1.close();
	 Session session2 = factory.openSession();
	Student st2=session2.get(Student.class, 0);
	System.out.println(st2);
	 session2.close();
	}

}

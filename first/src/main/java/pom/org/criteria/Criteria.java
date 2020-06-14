package pom.org.criteria;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import pom.org.first.Student;

 

public class Criteria { 

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		org.hibernate.Criteria criteria  = session.createCriteria(Student.class);
		criteria.add(Restrictions.like("certificate.course", "androif%"));
		List<Student>list=criteria.list();
		for(Student l:list) {System.out.println(l);}
		
		session.close();
		
		
		
		
		
	}
}

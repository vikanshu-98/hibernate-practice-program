package one2one;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Join_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 Session session=factory.openSession();
	String join="select  q.question,q.id,a.answer from Questions as q INNER JOIN q.answer  as a";
	
		 Query query=session.createQuery(join );
List<Object[]>list=	 query.getResultList();
		 
		 for(Object[] onj:list) {
			 System.out.println(Arrays.toString(onj));
		 }
		 
		 session.close();
factory.close();
	}

}

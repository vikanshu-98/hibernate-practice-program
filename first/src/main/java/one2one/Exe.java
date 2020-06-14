package one2one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

 

public class Exe {
	public  static void main(String args[])
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		 Session session=factory.openSession();
	
		 Questions q1=new Questions();
		 q1.setId(15);
		q1.setQuestion("what is java?");
		 answers a1=new answers();
		 a1. setAnswer_Id(144);
		 a1.setAnswer("it is a programing language ");
		 a1.setQuestion(q1);
		 
answers a2=new answers();
a2. setAnswer_Id(15);
		 a2.setAnswer("which is secure");
		 a2.setQuestion(q1);
		 List <answers>list1=new ArrayList<answers>();
		list1.add(a1);
		 list1.add(a2);
		 q1.setAnswer(list1);
		 session.beginTransaction();
		 session.save(q1);
		 
		 session.getTransaction().commit();
		 
		
		// Query query=session.createQuery("select a.answer,a.answer_id,q.Question from  answers as a inner join a.Question as  q");
		 //List<Object[]>list=query.getResultList();
		 /*for(Object[] ob:list)
		 {
			 System.out.println(Arrays.toString(ob));
		 }*/
		
		session.close();
		
		
		factory.close();
	}

}

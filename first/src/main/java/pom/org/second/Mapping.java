package pom.org.second;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.jdbc.IterateBlock;

import java.util.*;
public class Mapping {
	public static void main(String args[])
	{
		 Configuration conf=new Configuration();
		   conf.configure("hibernate.cfg.xml");
		   SessionFactory factory=conf.buildSessionFactory();
		   
		   Employee e1=new Employee();
		   Employee e2=new Employee();
		   
		Project p1=new Project();
		Project p2=new Project();
		 
		e1.setEmpId(12);
		e2.setEmpId(13);
		e1.setEmpName("ram");
		e2.setEmpName("shyam");
		
		p1.setProjectId(34);
		p2.setProjectId(35);
		
		p1.setProjectName("hostel mgmt ");
		p2.setProjectName("booking system");
		
		List<Employee>emp=new ArrayList<Employee>();
		List<Project>project=new ArrayList<Project>();
		emp.add(e1);
		emp.add(e2);
		project.add(p1);
		project.add(p2);
		
		e1.setProject(project);
		p1.setEmployee(emp);
	Session session=	factory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		session.getTransaction().commit();
    Employee emp4=(Employee)session.get(Employee.class, 12);
	 List<Project> p=emp4.getProject();
	Iterator iterate= p.iterator();
		while(iterate.hasNext())
		{
			Project pr=(Project)iterate.next();
			System.out.println(emp4.getEmpName()+"assign the project"+"\n"+" "+pr.getProjectId()+" "+pr.getProjectName());
			
		}
		
		
		session.close();
		factory.close();
	}

}

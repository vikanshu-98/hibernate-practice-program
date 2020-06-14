package pom.org.second;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
  @Id
  @Column(name="emp_id")
	private int empId;
  @Column(name="emp_name")
	private String empName;
  @ManyToMany
 @JoinTable
 (name="emp_project",joinColumns = {@JoinColumn(
		 name="emp_id")},inverseJoinColumns = {
				 @JoinColumn(name="project_id")
		 }		 
 
 
		 
		 
		 
		 )
	private List<Project> project;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public List<Project> getProject() {
	return project;
}
public void setProject(List<Project> project) {
	this.project = project;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empId, String empName, List<Project> project) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.project = project;
}
	
  
  
  
  
}

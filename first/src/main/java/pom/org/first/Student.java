package pom.org.first;
 

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

 

 
@Entity
@ Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public
class Student{
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	 
	private int id;
	
	private String name;
	
	private String Address;
	private Certificate certificate; 
	 
	 
	@Override
	public String toString() {
return this.id+" "+this.name+" "+this.Address;
}
	public Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	
	
	
	
	
	
	
}
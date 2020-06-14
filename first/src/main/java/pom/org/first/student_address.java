package pom.org.first;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name="ADRESS_OF_STUDENT")
public class student_address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_IS")
	private int Addressid;
	@Column(name = "STREET")
 private String street;
	
@Column(name = "OPEN")	
 private boolean isopen;
@Transient
 private int d;
@Column(name = "DATE")
@Temporal(TemporalType.DATE)
 private Date adddate;
@Lob
 private byte[]image;
	
	
	
	
	
	
	public int getAddressid() {
	return Addressid;
}






public void setAddressid(int addressid) {
	Addressid = addressid;
}






public String getStreet() {
	return street;
}






public void setStreet(String street) {
	this.street = street;
}






public boolean isIsopen() {
	return isopen;
}






public void setIsopen(boolean isopen) {
	this.isopen = isopen;
}






public int getD() {
	return d;
}






public void setD(int d) {
	this.d = d;
}






public Date getAdddate() {
	return adddate;
}






public void setAdddate(Date adddate) {
	this.adddate = adddate;
}






public byte[] getImage() {
	return image;
}






public void setImage(byte[] image) {
	this.image = image;
}






	public student_address(int addressid, String street, boolean isopen, int d, Date adddate, byte[] image) {
	super();
	Addressid = addressid;
	this.street = street;
	this.isopen = isopen;
	this.d = d;
	this.adddate = adddate;
	this.image = image;
}






	public student_address() {
		 
	}

}

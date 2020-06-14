package pom.org.first;

import javax.persistence.Embeddable;
import javax.persistence.Id;
@Embeddable
public class Certificate {

private int certificate_id;
private String course;
private String duration;
public int getCertificate_id() {
	return certificate_id;
}
public void setCertificate_id(int certificate_id) {
	this.certificate_id = certificate_id;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public Certificate(int certificate_id, String course, String duration) {
	super();
	this.certificate_id = certificate_id;
	this.course = course;
	this.duration = duration;
}
public Certificate() {
	super();
	// TODO Auto-generated constructor stub
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package one2one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
 

@Entity
public class answers {

	@Id
	 
	int answer_Id;
	
	String answer;
	@ManyToOne
	Questions question;
	public int getAnswer_Id() {
		return answer_Id;
	}
	public void setAnswer_Id(int answer_Id) {
		this.answer_Id = answer_Id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Questions getQuestion() {
		return question;
	}
	public void setQuestion(Questions question) {
		this.question = question;
	}
	public answers(int answer_Id, String answer, Questions question) {
		super();
		this.answer_Id = answer_Id;
		this.answer = answer;
		this.question = question;
	}
	public answers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

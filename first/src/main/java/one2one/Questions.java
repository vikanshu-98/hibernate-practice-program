package one2one;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Questions {
@Id
	int id;
	
   String Question;
   @OneToMany(mappedBy = "question" ,cascade = CascadeType.ALL )
	List<answers> answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public List<answers> getAnswer() {
		return answer;
	}
	public void setAnswer(List<answers> answer) {
		this.answer = answer;
	}
	public Questions(int id, String question, List<answers> answer) {
		super();
		this.id = id;
		Question = question;
		this.answer = answer;
	}
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

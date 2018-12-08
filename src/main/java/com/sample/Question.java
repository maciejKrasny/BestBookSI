package com.sample;
import java.util.ArrayList;
import java.util.List;

public class Question {
	private String Text = "";
    private String Answer = "";
    private List<String> AnswerOptions = new ArrayList<String>();
	
    
    public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	public List<String> getAnswerOptions() {
		return AnswerOptions;
	}
	public void setAnswerOptions(List<String> answerOptions) {
		AnswerOptions = answerOptions;
	}
	
	
	
	public Question() {
    }
	public Question(String text) {
		Text = text;
    }
    
    
	public void addYesNo() {
        this.AnswerOptions.add("YES");
        this.AnswerOptions.add("NO");
    }

	public void addTypes(String[] types) {
		for (int i=0; i<types.length;i++)
			this.AnswerOptions.add(types[i]);
		
	}
}

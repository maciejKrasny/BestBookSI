package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class FinalAnswer {
	private Boolean End = false;
    private List<String> BookList = new ArrayList<String>();
	
   
	
	public Boolean getEnd() {
		return End;
	}



	public void setEnd(Boolean end) {
		End = end;
	}



	public List<String> getBookList() {
		return BookList;
	}



	public void setBookList(List<String> bookList) {
		BookList = bookList;
	}



	public FinalAnswer() {
		
	}
	
	public void getOut() {
		BookList.add("Get out if you can't decide!");
	}
 

}

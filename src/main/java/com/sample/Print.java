package com.sample;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Enumeration;

import javax.swing.*;


public class Print {
	
	
	

	/*public static void showQuestion(Question question) {
		System.out.println(question.getText());
		for(int i = 0; i< question.getAnswerOptions().size(); i++){
		   	System.out.println(question.getAnswerOptions().get(i));
		}
		Scanner scan = new Scanner(System.in);
		String ans = scan.nextLine();
		question.setAnswer(ans);
	}*/
	public static void showQuestion(Question question) {
		JPanel panel = new JPanel();
	    panel.setLayout(new GridLayout(question.getAnswerOptions().size()+1, 1));
	    
	    ButtonGroup buttonsGroup = new ButtonGroup();
	    
	    JLabel questionText = new JLabel();
	    questionText.setText(question.getText());
	    panel.add(questionText);
	    
	    for (String answer : question.getAnswerOptions()) {
            JRadioButton button = new JRadioButton(answer);
            buttonsGroup.add(button);
            panel.add(button);
        }
	    
	    Integer option = JOptionPane.showOptionDialog(
                null,
                panel,
                "Books options",
                JOptionPane.CLOSED_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null
        );
	    
	    if (option.equals(0)) {
            for (Enumeration<AbstractButton> buttons = buttonsGroup.getElements(); buttons.hasMoreElements(); ) {
                AbstractButton button = buttons.nextElement();

                if (button.isSelected()) {
                    question.setAnswer(button.getText());
                }
            }
	    }
	
	
	}
	
	
	
	
	public static void result(List<String> books){
		
        JPanel panel = new JPanel();
        if (books.get(0) != "Get out if you can't decide!") {
        	
	        panel.setLayout(new GridLayout(books.size()+1,1));
	        
	        JLabel label = new JLabel("Books for you: ");
	        label.setFont(new Font("Serif", Font.BOLD, 20));
	        panel.add(label);
        }
        else {
        	panel.setLayout(new GridLayout(1,1));
	        
        }
        
        for (int i=0; i<books.size(); i++) {
        	panel.add(new JLabel(books.get(i)));
        }
        JOptionPane.showOptionDialog(null,panel,"Books",JOptionPane.CLOSED_OPTION,JOptionPane.PLAIN_MESSAGE,
        		null,
                null,
                null
        );
    }
	
	
}

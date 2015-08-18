package com.webonise.core;

import java.util.HashSet;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.webonise.dataObject.Answer;
import com.webonise.dataObject.Question;

public class MainClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Answer ans1=new Answer();
		ans1.setAnswer("JAVA is language");
		ans1.setPostedBy("Prasan");
		Answer ans2=new Answer();
		ans2.setAnswer("Java is Awesome");
		ans2.setPostedBy("Sudha");
		
		Answer ans3=new Answer();  
	    ans3.setAnswer("Servlet is Interface");  
	    ans3.setPostedBy("Jai");  	      
	    Answer ans4=new Answer();  
	    ans4.setAnswer("Servlet is API");  
	    ans4.setPostedBy("Arun");  

	    HashSet<Answer> list1= new HashSet<Answer>();
	    list1.add(ans1);
	    list1.add(ans2);
	    
	    HashSet<Answer> list2= new HashSet<Answer>();
	    list2.add(ans3);
	    list2.add(ans4);
	    
	    Question question1= new Question();
	    question1.setQuestion("What is Java ?");
	    question1.setAnswers(list1);
	    
	    Question question2= new Question();
	    question2.setQuestion("What is Servlet ?");
	    question2.setAnswers(list2);
	    
	    session.persist(question1);
	    session.persist(question2);
	    
	    tx.commit();
	    
	    session.close();
	    
	    System.out.println("Done !!!");
	    
	    
	    
	    
	}

}

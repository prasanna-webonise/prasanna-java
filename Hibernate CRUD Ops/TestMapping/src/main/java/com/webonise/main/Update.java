package com.webonise.main;

import org.hibernate.Session;

public class Update {

	public static void main(String[] args) {
		Session session = SessionManager.getSessionFactory().openSession();
		Student student = new Student();
		session.beginTransaction();

		student = (Student) session.get(Student.class, 15);
		student.setPhoneNum(17000000);
		session.update(student);

		session.getTransaction().commit();
		session.close();
		

	}

}

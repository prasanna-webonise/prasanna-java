

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

public class Read {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Session session = SessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		List students = session.createQuery("FROM Student").list();
		for (Iterator iterator = students.iterator(); iterator.hasNext();) {
			Student student1 = (Student) iterator.next();
			System.out.println("Roll Number: " + student1.getRollNo());
			System.out.println("Name: " + student1.getName());
			System.out.println("Date of birth: " + student1.getDob());
			System.out.println("Phone number: " + student1.getPhoneNum());
		}
		session.getTransaction().commit();
		session.close();

	}

}

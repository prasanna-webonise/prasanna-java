

import java.util.Date;

import org.hibernate.Session;

public class Create {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Session session = SessionManager.getSessionFactory().openSession();
		Student student = new Student(1, "Prasanna", new Date(93, 4, 28),
				8904518352L);
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}

}

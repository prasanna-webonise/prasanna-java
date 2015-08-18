

import org.hibernate.Session;

public class Delete {

	public static void main(String[] args) {
		Session session = SessionManager.getSessionFactory().openSession();
		Student student = new Student();
		session.beginTransaction();

		student = (Student) session.get(Student.class, 17);
		session.delete(student);

		session.getTransaction().commit();
		session.close();

	}

}

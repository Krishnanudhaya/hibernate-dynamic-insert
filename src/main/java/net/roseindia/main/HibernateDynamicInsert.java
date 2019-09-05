package net.roseindia.main;

import net.roseindia.table.Student;
import net.roseindia.util.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateDynamicInsert {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Student student = new Student();
			student.setName("Justin");
			student.setCourse("BE");
			session.save(student);
			transaction.commit();
			System.out.println("Record saved");
		} catch (HibernateException e) {
			//transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}

package com.jtcindia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab3 {
	public static void main(String[] args) {
//		Transaction tx=null;
//		try {
//			SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
//		Session session	= sessionFactory.openSession();
//		tx=session.beginTransaction();
//		//Your Persistence Operations hare
//		Customer cust=session.load(Customer.class, 1);
//		System.out.println(cust);
//		cust.setEmail("kdilip22@gmail.com");
//		cust.setPhone(143223);
//		cust.setCity("Patna");
//		session.update(cust);
//		tx.commit();
//		session.close();
//		} catch (Exception e) {
//			tx.rollback();
//			e.printStackTrace();
//		}
		
		
		
		
		
		Transaction tx=null;
		try {
			
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			
			tx =session.beginTransaction();
			//Your Persistance Operation hare
			Customer cust = session.load(Customer.class, 1);
			System.out.println(cust);
			cust.setEmail("kkkdeh@gmail.com");
			cust.setPhone(23522);
			cust.setCity("Delhi");
			session.update(cust);
			tx.commit();
			session.close();
                                  int a=99;
                                  int b=70;
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.jtcindia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab4 {
	public static void main(String[] args) {
//		Transaction tx=null;
//		try {
//	SessionFactory sessionFactory		=HibernateUtil.getSessionFactory();
//	Session session=sessionFactory.openSession();
//		tx=session.beginTransaction();
//		//Your Persistance Operation here
//	Customer cust	=session.load(Customer.class, 1);
//		System.out.println(cust);
//		session.delete(cust);
//		tx.commit();
//		session.close();
//		
//		
//		
//		
//		} catch (Exception e) {
//			 tx.rollback();
//			 e.printStackTrace();
//		}
		
		
		
		
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			tx= session.beginTransaction();
			//Your   Persistance Operation hare
			Customer cust = session.load(Customer.class, 1);
			System.out.println(cust);
			session.delete(cust);
			tx.commit();
			session.close();
			
			
			
			
			
		} catch (Exception e) {
		   tx.rollback();
		   e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package com.jtcindia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Lab1 {

	public static void main(String[] args) {
		 System.out.println("Proj Start...");
//		 
//		 Transaction  tx= null;
//			try {
//		//Step-1: get the SessionFactory Object
//		SessionFactory   sessionFactory=		HibernateUtil.getSessionFactory();
//		//Step-2:Open the Session
//		Session  session= sessionFactory.openSession();
//		//Step 3: Begin Transaction
//		tx=session.beginTransaction();
//		//Step 4: Do your operation
//		Customer cust= new Customer("Dom","web@jtc",2252,"Delhi");
//		session.save(cust);
//		//Step 5: End Tx(Transaction)
//		tx.commit();
//		//Step6: Close Session
//		session.close();
//		
//			} catch (Exception e) {
//				//Step 7: End Tx
//				 tx.rollback();
//				 e.printStackTrace();
//			}
//	
		 
		 
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			tx =session.beginTransaction();
			Customer cust = new Customer("som", "web@jtc", 25344, "Delhi");

			session.save(cust);
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
 
int i=66;
int j=43;
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
}

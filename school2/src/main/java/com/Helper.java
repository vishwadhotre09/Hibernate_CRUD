package com;

import java.util.List;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;

public class Helper {

	public static void main(String[] args) {
		//Creation of the data
		//		
		//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vk");
		//		EntityManager em=emf.createEntityManager();
		//		EntityTransaction et=em.getTransaction();

		//		Student s= new Student();
		//		s.setUsn(2);
		//		s.setName("Ravi");
		//		s.setPhno(958348446);
		//		s.setDept("Mech");
		//		
		//		et.begin();
		//		em.persist(s);
		//		et.commit();
		//		System.out.println("data");
		//		
		//updation

		//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vk");
		//		EntityManager em=emf.createEntityManager();
		//		EntityTransaction et=em.getTransaction();
		//		et.begin();
		//		Student s= em.find(Student.class,2);
		//		
		//		s.setDept("IT");
		//		et.commit();
		//		System.out.println("data updated");
		//	
		//Read the data
		//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vk");
		//		EntityManager em=emf.createEntityManager();
		//		EntityTransaction et=em.getTransaction();
		//		et.begin();
		//		Student s= em.find(Student.class,1);
		//		System.out.println(s.getDept());
		//		System.out.println(s.getName());
		//		System.out.println(s.getPhno());
		//		System.out.println(s.getUsn());



		//custom querries for read all data
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vk");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//
//		et.begin();
//		Query query= em.createQuery("select r from Student r");
//		et.commit();
//		List<Student> s1=query.getResultList();
//		for(Student std:s1) {
//			System.out.println(std);
//		}
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vk");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		Student s= em.find(Student.class,1);
		em.remove(s);
		et.commit();
		System.out.println("Data removed ");			
		}
	}

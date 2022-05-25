package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetPan {
    public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Pan pan = entityManager.find(Pan.class, 1);
		System.out.println(pan.getId());
		System.out.println(pan.getAddress());
		System.out.println(pan.getPanNumber());
		System.out.println("------------------------------------------");
		Person person = pan.getPerson();
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getEmail());
	}
}

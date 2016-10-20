package se.roflcoffel.maven.lab;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.commons.lang3.StringUtils;

public class Main {

	private static final EntityManagerFactory FACTORY =
			Persistence.createEntityManagerFactory("PersistenceUnit");

	public static void main(String[] args) {

		Employee employee = new Employee("Rolf", "Lövfendhal");
		System.out.println(employee);

		EntityManager manager = FACTORY.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(employee);
		manager.getTransaction().commit();

		System.out.println(employee);
	}
}

package se.roflcoffel.maven.lab;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.commons.lang3.StringUtils;

import se.roflcoffel.maven.lab.uppgift2.Department;
import se.roflcoffel.maven.lab.uppgift2.Employee;

public class Main {

	private static final EntityManagerFactory FACTORY =
			Persistence.createEntityManagerFactory("PersistenceUnit");

	public static void main(String[] args) {

		// Lektion 1 Tester.
		/*

		Employee employee = new Employee("Rolf", "Lövfendhal");
		System.out.println(employee);

		EntityManager manager = FACTORY.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(employee);
		manager.getTransaction().commit();

		System.out.println(employee);

		// JPA Uppgift 1

		UserRepository userRepository = new UserRepository();

		User user = new User("Rolf", "Lövendhal", "rolf123", "1234");
		User user1 = new User("Roy", "Johansson", "roro", "pass");
		User user2 = new User("Andreas", "Johansson", "rofl", "word");

		userRepository.createUser(user);
		userRepository.createUser(user1);
		userRepository.createUser(user2);


		for(User u : userRepository.getAll()) {
			System.out.println(u.getFirstName());
		}
		*/

		// JPA Uppgift 2

		Employee employee = new Employee("Andreas", "Johansson", "1", new Department("QA") );

		EntityManager manager = FACTORY.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(employee);
		manager.getTransaction().commit();
	}
}

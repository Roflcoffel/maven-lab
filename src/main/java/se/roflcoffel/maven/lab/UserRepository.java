package se.roflcoffel.maven.lab;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class UserRepository {
	
	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("PersistenceUnit");
	EntityManager manager = FACTORY.createEntityManager();
	
	public void createUser(User user) {
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
	}
	
	public User getUserById(Long id) {
		return manager.find(User.class, id);
	}
	
	public List<User> getAll() {
		return manager.createQuery("SELECT u FROM User u", User.class).getResultList();
	}
	
	public void update(Long id, String firstName, String lastName) {
		User user = manager.find(User.class, id);
		
		manager.getTransaction().begin();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		manager.getTransaction().commit();
	}
}

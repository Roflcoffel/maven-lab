package se.roflcoffel.maven.lab.uppgift2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Department {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@OneToOne(mappedBy = "department")
	private Employee employee;

	protected Department() {}

	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Employee getEmployee() {
		return employee;
	}
}

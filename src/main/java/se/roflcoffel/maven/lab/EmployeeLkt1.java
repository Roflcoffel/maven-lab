package se.roflcoffel.maven.lab;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

// JPA Lektion 1
@Entity
@Table(name = "employee")
public class EmployeeLkt1 {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "firstname", nullable = false)
	private String firstname;

	@Column(name = "lastname", nullable = false)
	private String lastname;

	protected EmployeeLkt1(){}

	public EmployeeLkt1(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}

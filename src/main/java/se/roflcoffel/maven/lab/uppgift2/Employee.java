package se.roflcoffel.maven.lab.uppgift2;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

// JPA Uppgift 2
@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "firstname", nullable = false)
	private String firstname;

	@Column(name = "lastname", nullable = false)
	private String lastname;

	@Column(name = "employeeNumber", nullable = false)
	private String employeeNumber;

	@OneToOne
	@JoinColumn(name = "DEPT_ID")
	private Department department;

	protected Employee(){}

	public Employee(String firstname, String lastname, String employeeNumber, Department department) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.employeeNumber = employeeNumber;
		this.department = department;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public Department getDepartment() {
		return department;
	}
}

package se.roflcoffel.maven.lab.uppgift2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ParkingSpace {

	private Long id;
	private String label;

	protected ParkingSpace() {}

	public ParkingSpace(Long id, String label) {
		this.id = id;
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public Long getId() {
		return id;
	}

}

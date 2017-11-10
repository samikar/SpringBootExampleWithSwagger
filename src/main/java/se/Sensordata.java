package se;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sensordata database table.
 * 
 */
@Entity
@NamedQuery(name="Sensordata.findAll", query="SELECT s FROM Sensordata s")
public class Sensordata implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int municipality;

	private String name;

	private int sensorid;

	private Timestamp timestamp;

	private double value;

	public Sensordata() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMunicipality() {
		return this.municipality;
	}

	public void setMunicipality(int municipality) {
		this.municipality = municipality;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSensorid() {
		return this.sensorid;
	}

	public void setSensorid(int sensorid) {
		this.sensorid = sensorid;
	}

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}
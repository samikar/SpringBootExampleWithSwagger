package se;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the municipality database table.
 * 
 */
@Entity
@NamedQuery(name="Municipality.findAll", query="SELECT m FROM Municipality m")
public class Municipality implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MUNICIPALITY_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MUNICIPALITY_ID_GENERATOR")
	private int id;

	private int fid;

	private int fid2;

	private int mid;

	private String name;

	private String nameswedish;

	private double x;

	private double y;

	public Municipality() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFid() {
		return this.fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public int getFid2() {
		return this.fid2;
	}

	public void setFid2(int fid2) {
		this.fid2 = fid2;
	}

	public int getMid() {
		return this.mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameswedish() {
		return this.nameswedish;
	}

	public void setNameswedish(String nameswedish) {
		this.nameswedish = nameswedish;
	}

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
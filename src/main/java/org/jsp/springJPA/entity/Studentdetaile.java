package org.jsp.springJPA.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the studentdetailes database table.
 * 
 */
@Entity
@Table(name="studentdetailes")
@NamedQuery(name="Studentdetaile.findAll", query="SELECT s FROM Studentdetaile s")
public class Studentdetaile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer rollno;

	private double percentage;

	private String stdname;

	private String stream;

	public Studentdetaile() {
	}

	public int getRollno() {
		return this.rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getPercentage() {
		return this.percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getStdname() {
		return this.stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getStream() {
		return this.stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

}
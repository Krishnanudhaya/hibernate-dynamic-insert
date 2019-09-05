package net.roseindia.table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
@org.hibernate.annotations.Entity(dynamicInsert = true)

public class Student implements Serializable {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="roll_no")
	private int roll;
	
	@Column(name="name")
	private String name;
	
	@Column(name="course")
	private String course;

	public Student() {

	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
package com.sunil.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@JsonInclude(Include.NON_NULL)
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String course;
	private String branch;

	@JsonFormat(pattern = "yyyy-mm-dd", shape = Shape.STRING)
	private String dob;

	public Student() {

	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public Student setId(int id) {
		this.id = id;
		return this;
	}

	public String getCourse() {
		return course;
	}

	public Student setCourse(String course) {
		this.course = course;
		return this;
	}

	public String getBranch() {
		return branch;
	}

	public Student setBranch(String branch) {
		this.branch = branch;
		return this;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", course=" + course + ", branch=" + branch + "]";
	}

}

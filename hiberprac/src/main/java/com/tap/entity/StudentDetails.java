package com.tap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentDetails")
public class StudentDetails {
	@Id
	@Column(name = "sdid")
	private int sdid;
	@Column(name = "course")
	private String course;
	
	@Column(name = "marks")
	private int marks;
	@OneToOne(mappedBy ="sid")
	private StudentEntity student;
	
	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}

	public StudentDetails() {
    }
	
	    public StudentDetails(int sdid, String course, int marks) {			
	    	this.sdid = sdid;
            this.course = course;
            this.marks = marks;
	    }
    public StudentDetails(String course, int marks) {
    	this.course = course;
        this.marks = marks;
    }

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public int getSdid() {
		return sdid;
	}

	public void setSdid(int sdid) {
		this.sdid = sdid;
	}

	@Override
	public String toString() {
		return "StudentDetails [course=" + course + ", marks=" + marks + "]"+"sdid=" + sdid;
	}
    
}

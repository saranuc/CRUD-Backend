package com.excom.crud.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentid;
	
	@Column(name  = "student_name")
	private String studentname;
	
	@Column(name  = "student_address")
	private String studentaddress;
	
	@Column(name  = "student_mobile")
	private int mobileno;
	
	@Column(name  = "student_active",columnDefinition =" TINYINT default 1")
	private boolean active;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentaddress() {
		return studentaddress;
	}

	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentid, String studentname, String studentaddress, int mobileno, boolean active) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentaddress = studentaddress;
		this.mobileno = mobileno;
		this.active = active;
	}

	public Student( String studentname, String studentaddress, int mobileno, boolean active) {
		super();
		
		this.studentname = studentname;
		this.studentaddress = studentaddress;
		this.mobileno = mobileno;
		this.active = active;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentaddress=" + studentaddress
				+ ", mobileno=" + mobileno + ", active=" + active + "]";
	}
}

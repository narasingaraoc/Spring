package com.citi.MySpring.Inheritance;

public class ChildClass {

	private String studentName;
	private int studentID;

	private String fatherName;
	private String motherName;

	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}


	
	@Override
	public String toString() {
		return "ChildClass [studentName=" + studentName + ", studentID=" + studentID + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + "]";
	}
}

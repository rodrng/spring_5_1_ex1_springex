package com.javagyeongmin.ex;

public class StudentInfo {
	
	Student student; // �ʵ�

	public StudentInfo(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void getStudentInfoPrint() {
		System.out.println("�̸� " + student.getName());
		System.out.println("���� " + student.getAge());
		System.out.println("�г� " + student.getGradeNum());
		System.out.println("�� " + student.getClassNum());
	}
	
	
	
}
package com.cg.placement.repository;

import com.cg.placement.entities.Student;

public interface IStudentRepository {

	public Student addStudent(Student student);


	public void updateStudent(Student student);

	public Student searchStudentById(int id);

	public Student searchStudentByHallTicket(int hallTicketNo);

	public Student deleteStudent(Student student);

	public abstract void beginTransaction();

	public abstract void commitTrasaction();

	void deleteStudent(int id);




}

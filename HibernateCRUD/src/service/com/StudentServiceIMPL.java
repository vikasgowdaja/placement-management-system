package service.com;

import dao.com.StudentDAO;
import dao.com.StudentDAOIMPL;
import entities.com.Student;
public class StudentServiceIMPL  implements StudentService {
	private StudentDAO dao;
	public StudentServiceIMPL() 
	 {
	dao = new StudentDAOIMPL();
	}
	@Override
	public void addStudent(Student student) {
	dao.beginTransaction();
	dao.addStudent(student);
	dao.commitTransaction();
	}
	@Override
	public void updateStudent(Student student) {
	dao.beginTransaction();
	dao.updateStudent(student);
	dao.commitTransaction();
	}
	@Override
	public void removeStudent(Student student) {
	dao.beginTransaction();
	dao.removeStudent(student);
	dao.commitTransaction();
	}
	@Override
	public Student findStudentById(int id) {
	//no need of transaction, as it's an read operation
	Student student = dao.getStudentById(id);
	return student;
	}
	}
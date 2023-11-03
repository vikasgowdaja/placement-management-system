package dao.com;

import entities.com.Student;
public interface StudentDAO {
public abstract Student getStudentById(int id);
public abstract void addStudent(Student student);
public abstract void removeStudent(Student student);
public abstract void updateStudent(Student student);
public abstract void commitTransaction();
public abstract void beginTransaction();
}
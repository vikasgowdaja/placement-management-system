package dao.com;

import javax.persistence.EntityManager;
import entities.com.Student;
public class StudentDAOIMPL implements StudentDAO
{
private EntityManager entityManager;
public StudentDAOIMPL() {
entityManager = JPA.getEntityManager();
}
@Override
public Student getStudentById(int id) {
Student student = entityManager.find(Student.class, id);
return student;
}
@Override
public void addStudent(Student student) {
entityManager.persist(student);
}
@Override
public void removeStudent(Student student) {
entityManager.remove(student);
}
@Override
public void updateStudent(Student student) {
entityManager.merge(student);
}
@Override
public void beginTransaction() {
entityManager.getTransaction().begin();
}
@Override
public void commitTransaction() {
entityManager.getTransaction().commit();
}
}
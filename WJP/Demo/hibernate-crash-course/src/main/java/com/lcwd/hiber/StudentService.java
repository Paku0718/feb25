package com.lcwd.hiber;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import com.lcwd.hiber.entities.Student;
import com.lcwd.hiber.util.HibernateUtil;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class StudentService {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	//save student
	public void saveStudent(Student student) {
		try(Session session = sessionFactory.openSession()){
			Transaction beginTransaction =  session.beginTransaction();
			
			session.persist(student);
			
			beginTransaction.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//get by id
	public Student getById(long studentId) {
		try(Session session = sessionFactory.openSession()){
			Student student = session.get(Student.class, studentId);
			return student;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
			
		}
	}
	
	//update student
	public Student updateStudent(long studentId, Student student) {
		try(Session session = sessionFactory.openSession()){
			Transaction transaction = session.beginTransaction();
			Student oldStudent = session.get(Student.class, studentId);
			
			if(oldStudent!=null) {
				oldStudent.setName(student.getName());
				oldStudent.setFatherName(student.getFatherName());
				oldStudent.setCollege(student.getCollege());
				oldStudent.setAbout(student.getAbout());
				oldStudent.setPhone(student.getPhone());
				
				Student updatedStudent = session.merge(oldStudent);
				
			}
			
			transaction.commit();
			return oldStudent;
		}
	}
	
	//delete student
	public void deleteStudent(long studentId) {
		try(Session session = sessionFactory.openSession()) {
			Transaction transaction = session.beginTransaction();
			Student student = session.get(Student.class, studentId);
			if(student!=null) {
				session.remove(student);
			}
			transaction.commit();
		}
	}
	
	//HQL[JPA]--> native query
	//database independent
	
	//get all the student using hql
	public List<Student> getAllStudentsHQL(){
		try(Session session = sessionFactory.openSession()){
			String getHQL= "FROM Student";
			Query<Student> query = session.createQuery(getHQL,Student.class);
			return query.list();
			
		}
	
	}
	
	//get student by name HQL
	public Student getStudentByNameHQL(String name) {
		try(Session session = sessionFactory.openSession()) {
			String getByNameHQL = "From Student WHERE name = :studentName";
			Query<Student> query = session.createQuery(getByNameHQL,Student.class);
			query.setParameter("StudentName", name);
			return query.uniqueResult();
		}
	}
	
	//criteria api
	//get all student of same college
	public List<Student> getStudentsByCollegeCriteria(String college){
		try (Session session = sessionFactory.openSession()){
			HibernateCriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<Student> query  = criteriaBuilder.createQuery(Student.class);
			Root<Student>root = query.from(Student.class);
			query.select(root).where(criteriaBuilder.equal(root.get("college"), college));
			Query<Student> query2 = session.createQuery(query);
			return query2.getResultList();
		}
	}
	
	public List<Student> getStudentWithPagination(int pageNo, int pageSize){
		try(Session session = sessionFactory.openSession()) {
			
			String pagiQuery = "FROM Student";
			
			Query<Student> query = session.createQuery("",Student.class);
			
			query.setFirstResult((pageNo-1)*pageSize);
			
			query.setMaxResults(pageSize);
			
			return query.list();
		}
	}
	
}

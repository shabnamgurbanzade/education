package com.travel.education.repository;

import com.travel.education.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Component
public class StudentRepository {
    @Autowired
    private EntityManager entityManager;
    @Transactional
    public void insertStudent(Student student) {
        entityManager.persist(student);
    }

    @Transactional
    public void delete(int id) {
        final Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);
    }
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);

    }

    public List<Student> getList() {
        Query query = entityManager.createQuery("SELECT s FROM Student s");
        final List<Student> resultList = query.getResultList();
        return resultList;
    }

    public List<Student> getList(Integer id, String name, String lastname) {
        String jpql = "SELECT s FROM Student s WHERE 1=1";
        if (id!=null){
            jpql += " and id = :id";
        }
        if (name!=null && !name.isEmpty()){
            jpql += " and name = :name";
        }
        if (lastname!=null && !lastname.isEmpty()){
            jpql += " and lastname = :lastname";
        }

        Query query = entityManager.createQuery(jpql);

        if (id!=null){
            query.setParameter("id", id);
        }
        if (name!=null && !name.isEmpty()){
            query.setParameter("name", name);
        }
        if (lastname!=null && !lastname.isEmpty()){
            query.setParameter("lastname", lastname);
        }

        final List<Student> resultList = query.getResultList();
        return resultList;
    }

    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }
}

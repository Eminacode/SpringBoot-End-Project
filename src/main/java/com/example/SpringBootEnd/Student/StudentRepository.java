package com.example.SpringBootEnd.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository <Student,Long>{
    void getAll(List<Student> student1);
    /*@Query(value = "SELECT s FROM Student s WHERE s.id" )
    List<Student> getStudentById();

    public List<Student> getStudentById (Long id);
    int deleteStudentById(Long id);

    public void getAll(List<Student> student1);*/
}

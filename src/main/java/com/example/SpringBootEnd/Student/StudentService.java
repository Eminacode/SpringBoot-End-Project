package com.example.SpringBootEnd.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        studentRepository.save(student);
    }

    public Object deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
        return null;
    }

    public String getStudentById(Long studentId) {
        return studentRepository.toString();
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}

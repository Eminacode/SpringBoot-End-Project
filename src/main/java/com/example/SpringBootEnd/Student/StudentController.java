package com.example.SpringBootEnd.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping (path = "api/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping
    public String registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
        return studentService.toString();
    }
    @GetMapping ("/gelAllStudents/")
    public List<Student> getAllStudents() {
        return studentService.getStudents();
    }
    @GetMapping
    public String getStudentById(@PathVariable ("id") Long id) {
         return studentService.getStudentById(id);
    }
    @GetMapping(path = "/students/{id}")
    public String retrieveCoursesForStudent(@PathVariable Long id) {
        return studentService.getStudentById((Long) id);
    }
    @DeleteMapping(path = "/delete/{id}")
    public boolean deleteStudent(@PathVariable("id") Long id){
        if(!Objects.equals(studentService.deleteStudent(id), Optional.empty())){
            studentService.deleteById(id);
            return true;
        }
        return false;
    }
}

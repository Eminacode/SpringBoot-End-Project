package com.example.SpringBootEnd.Student;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "Student")
@NoArgsConstructor

public class Student {
    @Id
    private Long id;
    private String name;
    private String email;
    private Integer age;

    public Student(Long id,
                   String name,
                   String email,
                   Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Student(String name,
                   String email,
                   Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

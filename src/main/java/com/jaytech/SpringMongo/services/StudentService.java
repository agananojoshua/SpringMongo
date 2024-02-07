package com.jaytech.SpringMongo.services;

import com.jaytech.SpringMongo.entity.Student;
import com.jaytech.SpringMongo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public void saveorUpdate(Student students) {

        studentRepo.save(students);

    }

    public Iterable<Student> litAll() {

        return this.studentRepo.findAll();

    }

    public void deleteStudent(String id) {
        studentRepo.deleteById(id);
    }

    public Student getStudentByID(String studentid) {
        return studentRepo.findById(studentid).get();
    }
}

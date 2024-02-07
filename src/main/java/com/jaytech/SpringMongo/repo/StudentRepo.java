package com.jaytech.SpringMongo.repo;

import com.jaytech.SpringMongo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, String> {
}

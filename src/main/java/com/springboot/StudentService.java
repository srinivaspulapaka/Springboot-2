package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pulapakas on 24-02-2017.
 */
@Service
public class StudentService {

    private final Logger log = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentRepository repository;

    public List<StudentPojo> findStudentsByName(){


        return repository.findAll();
    }
public StudentPojo saveStudent(StudentPojo pojo){
    return repository.save(pojo);
}
    public List<StudentPojo> findStudentsByName(String name){


        return repository.findStudentsByName(name);
    }

}

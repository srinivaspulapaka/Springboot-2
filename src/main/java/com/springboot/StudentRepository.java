package com.springboot;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


/**
 * Created by pulapakas on 24-02-2017.
 */
@RepositoryRestResource(collectionResourceRel = "stud", path = "stud")
public interface StudentRepository extends MongoRepository<StudentPojo, String> {


    //@Query
    public List<StudentPojo> findStudentsByName();


    @Query(value = "{ 'name' : ?0 }")
    public List<StudentPojo> findStudentsByName(String name);

}

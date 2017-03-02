package com.springboot;


import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by pulapakas on 24-02-2017.
 */
@Transactional
@RestController
@RequestMapping("/students")
public class StudentController {

    private static final Logger log = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    //public  List<StudentPojo> findByName( )
    public ResponseEntity<Response> findByName() {

        log.info("Getting Student ByName");
        Response response = new Response();
        //return Lists.newArrayList(service.findStudentsByName());
        List<StudentPojo> studentsList = service.findStudentsByName();
        if (studentsList == null || studentsList.size() == 0) {
            response.setStatus(StatusCode.E400);
            return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
        } else {
            response.setContent(studentsList);
            response.setStatus(StatusCode.U200);
            return new ResponseEntity<Response>(response, response.getHttpStatus());
        }

    }

    @RequestMapping(method = RequestMethod.POST, value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Response> validateStudent(@RequestBody StudentPojo pojo) {
        Response response = new Response();
        StudentPojo studentsLists = (StudentPojo) service.saveStudent(pojo);
        if (studentsLists == null) {
            response.setStatus(StatusCode.E400);
            return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
        } else {

           // response.setContent(studentsLists);
            response.setStatus(StatusCode.U200);
            response.setContent("Inserted successfully");
            return new ResponseEntity<Response>(response, response.getHttpStatus());
            //return "saved Successfully"+studentsLists.toString();
        }
    }
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
   // public List<StudentPojo> findStudentByName(@PathVariable("name") String name){
    public List<StudentPojo> findStudentByName(@PathVariable("name") String name){
log.info("successfully Retrived.....+"+service.findStudentsByName(name) );
return Lists.newArrayList(service.findStudentsByName(name));




    }
}

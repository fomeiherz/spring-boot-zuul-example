package top.fomeiherz.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.fomeiherz.model.Student;

import java.util.Date;

@RestController
public class StudentController {

    @RequestMapping(value = "/echoStudentName/{name}")
    public String echoStudentName(@PathVariable(name = "name") String name) {
        return "Hello  " + name + " , Response on : " + new Date();
    }

    @RequestMapping(value = "/getStudentDetails/{name}")
    public Student getStudentDetails(@PathVariable(name = "name") String name) {
        return new Student(name, "Pune", "MCA");
    }

}

package com.Anmol.student._management.Controller;

import com.Anmol.student._management.Model.Student;
import com.Anmol.student._management.Service.StudentService;

import com.Anmol.student._management.dto.StudentDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to Student Management System";
    }

    // Add Student
    @PostMapping("/students")
    public String addStudent(@Valid @RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // Get All Students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Get Student By ID
    @GetMapping("/students/{id}")
    public StudentDTO getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    // Update Student
    @PutMapping("/students/{id}")
    public String updateStudent(@PathVariable int id,
                                @Valid @RequestBody Student updatedStudent) {

        return studentService.updateStudent(id, updatedStudent);
    }

    // Delete Student
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {

        return studentService.deleteStudent(id);
    }
}
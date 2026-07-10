package com.Anmol.student._management.Service;

import com.Anmol.student._management.Exception.StudentNotFoundException;
import com.Anmol.student._management.Model.Student;
import com.Anmol.student._management.Repository.StudentRepository;
import com.Anmol.student._management.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();

    //add
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student Added Successfully";
    }
    //get all
    public List<Student> getAllStudents()       {
        return studentRepository.findAll();
    }
    ////get student by id
    public StudentDTO getStudentById( int id){
        Student student = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student with ID"+" " + id +" "+  "not found"));
        return convertToDTO(student);
    }
    //update student
    public String updateStudent(int id,Student updatedStudent) {

             Student student= studentRepository.findById(id).orElse(null);

            if (student== null) {
                return "Student not found";
            }

                student.setName(updatedStudent.getName());
                student.setAge(updatedStudent.getAge());
                student.setCourse(updatedStudent.getCourse());
                student.setEmail(updatedStudent.getEmail());

                studentRepository.save(student);

                return "Student Updated Successfully";
            }
    //delete student
    public String deleteStudent(int id) {

        if(studentRepository.existsById(id)) {

            studentRepository.deleteById(id);

            return "Student Deleted Successfully";
        }

        return "Student Not Found";
    }
    @Autowired
    private StudentRepository studentRepository;
    public StudentDTO convertToDTO(Student student){

        StudentDTO dto = new StudentDTO();

        dto.setName(student.getName());
        dto.setCourse(student.getCourse());
        dto.setEmail(student.getEmail());

        return dto;
    }

}
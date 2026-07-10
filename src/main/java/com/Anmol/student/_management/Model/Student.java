package com.Anmol.student._management.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    private int id;
    @NotBlank(message= "Name should not be blank")
    private String name;
    @Min(value=18 , message= "Age should be Atleast 18")
    private int age;
    @NotBlank(message= "Course should not be empty")
    private String course;
    @Email(message= "Enter a valid Email")
    @NotBlank(message = "email cannot be empty")
    private String email;
}

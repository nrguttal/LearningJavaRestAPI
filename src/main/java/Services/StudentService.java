package services;

import models.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public Student createStudent(Student student) {
        // In a real application, save the student to a database
        // For now, just return the received student object
        return student;
    }

    public Student getStudentById(int id) {
        // In a real application, fetch the student from a database
        // Here, return a dummy student for demonstration
        return new Student(id, "Dummy Name", 20, "Dummy Course");
    }
}
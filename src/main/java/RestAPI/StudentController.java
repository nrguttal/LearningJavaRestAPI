package RestAPI;

import Models.Student;
import Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        // Validation: id > 0
        if (student == null || student.getId() <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id must be numeric and greater than 0");
        }
        // Validation: name is non-empty
        if (student.getName() == null || student.getName().trim().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Name must be non-empty");
        }
        // Validation: age > 0
        if (student.getAge() <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Age must be numeric and greater than 0");
        }
        // Validation: course is non-empty
        if (student.getCourse() == null || student.getCourse().trim().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Course must be non-empty");
        }
        return studentService.createStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }
}
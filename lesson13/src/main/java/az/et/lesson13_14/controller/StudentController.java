package az.et.lesson13.controller;

import az.et.lesson13.model.Student;
import az.et.lesson13.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;
@Log4j2
@Validated
@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {



    private final StudentService studentService;

    @GetMapping
    public List<Student> findAllStudents() {
        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");
        return studentService.findAllStudents();
    }

    @GetMapping("/name")
    public Student findByName(@NotBlank @RequestParam("name") String name) {
        return studentService.findByName(name);
    }

    @PostMapping()
    public Student createStudent(@Valid @RequestBody Student student) {
        return studentService.createStudent(student);
    }
}

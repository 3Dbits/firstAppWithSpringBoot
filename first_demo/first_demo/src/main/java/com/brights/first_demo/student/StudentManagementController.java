package com.brights.first_demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "management/api/v1/student")
public class StudentManagementController {

    private final StudentService studentService;

    @Autowired
    public StudentManagementController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_ADMINTRAINEE')")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping(path = "{studentid}")
    @PreAuthorize("hasAuthority('student:write')")
    public Student getStudents(@PathVariable("studentid") Long studentId) {
        return studentService.getStudentsById(studentId);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('student:write')")
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentid}")
    @PreAuthorize("hasAuthority('student:write')")
    public void deleteStudent(@PathVariable("studentid") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentid}")
    @PreAuthorize("hasAuthority('student:write')")
    public void updateStudent(
            @PathVariable("studentid") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        studentService.updateStudent(studentId, name, email);
    }
}

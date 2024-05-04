package com.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class CourseEnrollmentController {

    @Autowired
    private CourseEnrollmentService courseEnrollmentService;

    @GetMapping
    public List<CourseEnrollment> getAllCourseEnrollments() {
        return courseEnrollmentService.getAllCourseEnrollments();
    }

    @GetMapping("/{id}")
    public CourseEnrollment getCourseEnrollmentById(@PathVariable Long id) {
        return courseEnrollmentService.getCourseEnrollmentById(id)
                .orElseThrow(() -> new RuntimeException("Course enrollment not found with id: " + id));
    }

    @PostMapping
    public CourseEnrollment addCourseEnrollment(@RequestBody CourseEnrollment courseEnrollment) {
        return courseEnrollmentService.saveOrUpdateCourseEnrollment(courseEnrollment);
    }

    @PutMapping("/{id}")
    public CourseEnrollment updateCourseEnrollment(@PathVariable Long id, @RequestBody CourseEnrollment courseEnrollment) {
        courseEnrollment.setId(id);
        return courseEnrollmentService.saveOrUpdateCourseEnrollment(courseEnrollment);
    }

    @DeleteMapping("/{id}")
    public void deleteCourseEnrollment(@PathVariable Long id) {
        courseEnrollmentService.deleteCourseEnrollment(id);
    }
}

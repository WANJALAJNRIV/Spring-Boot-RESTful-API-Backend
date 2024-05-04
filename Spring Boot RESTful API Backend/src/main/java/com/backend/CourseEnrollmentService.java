package com.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseEnrollmentService {

    @Autowired
    private CourseEnrollmentRepository courseEnrollmentRepository;

    public List<CourseEnrollment> getAllCourseEnrollments() {
        return courseEnrollmentRepository.findAll();
    }

    public Optional<CourseEnrollment> getCourseEnrollmentById(Long id) {
        return courseEnrollmentRepository.findById(id);
    }

    public CourseEnrollment saveOrUpdateCourseEnrollment(CourseEnrollment courseEnrollment) {
        return courseEnrollmentRepository.save(courseEnrollment);
    }

    public void deleteCourseEnrollment(Long id) {
        courseEnrollmentRepository.deleteById(id);
    }
}

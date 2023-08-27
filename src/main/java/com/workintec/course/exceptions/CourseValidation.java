package com.workintec.course.exceptions;

import com.workintec.course.entity.Course;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

public class CourseValidation {
    public static void checkCourseIsValid(Course course) {
        if((course.getCredit() < 0 || course.getCredit() > 4) ||
        course.getName() == null || course.getName().isEmpty()) {
            throw new CourseException("Course credentials have problem", HttpStatus.BAD_REQUEST);
        }
    }
    public static void isIdValid(int id) {
        if(id <= 0) {
            throw new CourseException("Id is not valid",HttpStatus.BAD_REQUEST);
        }
    }
    public static void isDublicateNameFound(List<Course> courses, String name) {
        Optional<Course> foundCourse = courses.stream().filter(c-> c.getName().equals(name)).findFirst();
        if(foundCourse.isPresent()) {
            throw new CourseException("Course with this name already exist: "+ name, HttpStatus.BAD_REQUEST);
        }
    }
}

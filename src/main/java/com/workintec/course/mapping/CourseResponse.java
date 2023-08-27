package com.workintec.course.mapping;

import com.workintec.course.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponse {
    private Course course;
    private double totalGpa;
}

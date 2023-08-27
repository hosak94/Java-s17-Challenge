package com.workintec.course.entity;

import org.springframework.stereotype.Component;

@Component
public class LowCourseGpa implements CourseGpa{
    @Override
    public int getGpa() {
        return 3;
    }
}

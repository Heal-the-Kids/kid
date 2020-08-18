package com.study.study01.factory.simple;

import com.study.study01.factory.ICourse;
import com.study.study01.factory.JavaCourse;
import com.study.study01.factory.PythonCourse;

/**
 * 工厂模型
 * Created by kid
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();

        CourseFactory factory1 = new CourseFactory();
        ICourse course1 = factory.create(PythonCourse.class);
        course1.record();

    }
}

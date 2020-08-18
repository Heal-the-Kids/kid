package com.study.study01.factory.method;


import com.study.study01.factory.ICourse;
import com.study.study01.factory.JavaCourse;

/**
 * Created by kid.
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}

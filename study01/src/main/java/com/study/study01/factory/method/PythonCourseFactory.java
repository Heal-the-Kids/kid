package com.study.study01.factory.method;


import com.study.study01.factory.ICourse;
import com.study.study01.factory.PythonCourse;

/**
 * Created by kid.
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}

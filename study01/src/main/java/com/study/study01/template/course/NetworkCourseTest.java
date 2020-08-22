package com.study.study01.template.course;

/**
 * @Auther: kid
 * @Date: 2020/8/22 14:08
 * @Description:
 */
public class NetworkCourseTest {
    public static void main(String[] args) {

        System.out.println("---Java架构师课程---");
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("---大数据课程---");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();

    }
}

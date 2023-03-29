package day18varargsstringbuilderstringbuffer;

import day19constructorsaccessmodifiersstatic.Teacher;

public class TeacherRunner {

    public static void main(String[] args) {

        Teacher yourTeacher = new Teacher();

        //1) If you are in a different package "default" variables will be "inaccessible"
        //2) If you are in a different package and the class you created the object is not the "child class", "protected" variables
        //   will be "inaccessible"
        //3) "private" things cannot be accessible from outside the class.
        //4) "public" ones will be accessible from entire the project.
        System.out.println(yourTeacher.teacherName);

    }
}


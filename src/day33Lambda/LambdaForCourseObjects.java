package day33Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaForCourseObjects {

    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Turkish Day Time", 124, "Summer", 97.2);
        Course courseTurkishNight = new Course("Turkish Night Time", 125, "Winter", 98.4);
        Course courseEnglishDay = new Course("English Day Time", 138, "Spring", 93.8);
        Course courseEnglishNight = new Course("English Night Time", 111, "Winter", 95);

        List<Course> courses = new ArrayList<>();
        courses.add(courseTurkishDay);
        courses.add(courseTurkishNight);
        courses.add(courseEnglishDay);
        courses.add(courseEnglishNight);
        System.out.println(courses);

        System.out.println(checkAvgScoresToBeGreaterThanAnyNumber(courses, 91));
        System.out.println(checkIfAnyCourseNameContainsAnyWord(courses, "Turkish"));
        printCourseWhoseAvrIsTheHighest(courses);
        System.out.println(skipFirstTwoReturnOthersAfterSorting(courses));
        //[{courseName='Turkish Day Time', numOfStudents=124, season='Summer', averageScore=97.2}, {courseName='Turkish Night Time', numOfStudents=125, season='Winter', averageScore=98.4}]

        printThirdCourseAfterSortingReversed(courses);
    }

    //1)Create a method to check if all average scores are greater than 91
    public static boolean checkAvgScoresToBeGreaterThanAnyNumber(List<Course> courses, double avg){
        return courses.stream().allMatch(t->t.getAverageScore()>avg);
    }

    //2)Create a method to check if at least one of the course names contains "Turkish" word
    public static boolean checkIfAnyCourseNameContainsAnyWord(List<Course> courses, String word){
        return courses.stream().anyMatch(t->t.getCourseName().contains(word));
    }

    //3)Create a method to print the course whose average score is the highest
    public static void printCourseWhoseAvrIsTheHighest(List<Course> courses){
        Course course = courses.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();
        System.out.println(course);
    }

    //4)Sort the list elements according to the average score in ascending order and skip first 2 elements
    public static List<Course> skipFirstTwoReturnOthersAfterSorting(List<Course> courses){
        return courses.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
    }

    //5)Sort the list elements according to the number of students in descending order and print just the 3rd one
    public static void printThirdCourseAfterSortingReversed(List<Course> courses){
        List<Course> course = courses.
                stream().
                sorted(Comparator.comparing(Course::getNumOfStudents).reversed()).
                skip(2).
                limit(1).
                collect(Collectors.toList());
        System.out.println(course);//[{courseName='Turkish Day Time', numOfStudents=124, season='Summer', averageScore=97.2}]
    }
}
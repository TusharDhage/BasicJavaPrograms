package JavaTrickyProblem3;

import java.util.ArrayList;
import java.util.List;

public class StudentsTest {
    public static void main(String[] args) {
        Student s1 = new Student("Tushar",12,91,27);
        Student s2 = new Student("Ajinkya",13,95,28);
        Student s3 = new Student("Sanket",14,56,26);
        Student s4 = new Student("Azhar",15,65,25);

        //add all students objects into arrayList
        List<Student> studentList = new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        System.out.println("total students are :"+ studentList.size());
        //ForEach Loop
        System.out.println("For Each Loop Result");
        for (Student st:studentList) {
            System.out.println(st);
        }
        System.out.println("================================");
        //Streams
        System.out.println("Stream Result");
        studentList.stream().forEach(e -> System.out.println(e));
        System.out.println("================================");

        System.out.println("Passed Students");
        studentList.stream().filter(e -> e.getMarks() >= 65).forEach(e ->
                System.out.println(e.getName() + ":" + e.getMarks()));
        System.out.println("================================");

        //name who got the highest marks
        int hm = studentList.stream().map(e -> e.getMarks()).max(Integer :: compare).get();
        System.out.println("Highest Marks : "+ hm);

        studentList.stream().filter(e -> e.getMarks() == hm).forEach(e -> System.out.println(e));
        System.out.println("================================");
    }
}

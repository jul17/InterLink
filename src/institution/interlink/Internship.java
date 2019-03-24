package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Internship {

    private String name;
    private List<Student> studentList = new ArrayList<>();


    public Internship(String name) {
        this.name = name;
    }


    public void setStudent(List<Student> studentList) {
        Stream<Student> studentStream = studentList.stream();

        double result = studentStream.distinct().mapToDouble(n -> n.getKnowledge().getLevel()).average().orElse(0);

        System.out.println("Avarage level: " + result);

        if (result != 0) {
            for (Student st : studentList) {
                if (studentList.contains(st) && st.getKnowledge().getLevel() > result) {
                    this.studentList.add(st);
                }
            }
        } else {
            System.out.println("There is no one to enter");
        }
    }


    public List<Student> getStudentList() {
        return studentList;
    }


    public void printStudents() { //printing a list of student
        for (Student st : studentList) {
            System.out.println(st.getName() + " with a level of knowledge " + st.getKnowledge().getLevel());
        }
    }
}

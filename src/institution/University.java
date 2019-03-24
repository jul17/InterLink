package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Student> studentList = new ArrayList<>();


    public University(String name) {
        this.name = name;
    }


    public void setStudent(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }


    public List<Student> getStudentList() {
        return studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printStudents() {//printing a list of student
        for (Student st : studentList) {
            System.out.println(st.getName() + " with a level of knowledge " + st.getKnowledge().getLevel());
        }
    }
}






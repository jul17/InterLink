package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Application {

    private static List<Student> studentsWright() {
        return asList(
                new Student("Andrew Kostenko", new Knowledge(9)),
                new Student("Julia Veselkina", new Knowledge(10)),
                new Student("Maria Perechrest", new Knowledge(4))
        );
    }

    public static void main(String[] args) {
        University university = new University("CH.U.I.");

        university.setStudent(studentsWright());

        System.out.println("All students");
        university.printStudents();
        System.out.println();

        Internship internship = new Internship("Interlink");

        internship.setStudent(university.getStudentList());

        System.out.println("List of internship's students:");
        internship.printStudents();
    }
}

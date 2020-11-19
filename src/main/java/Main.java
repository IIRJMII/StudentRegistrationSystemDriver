import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static ArrayList<CourseProgramme> courses = new ArrayList();
    private static ArrayList<Student> students = new ArrayList();

    public static void printCourses() {
        for(CourseProgramme c : courses) {
            System.out.println(c.getName());
            for(Module m : c.getModules()) {
                System.out.println("\t"+m.getName());
                for(Student s : m.getStudents()) {
                    System.out.println("\t\t"+s.getName()+" ["+s.getUsername()+"]");
                }
            }
        }
        System.out.println();
    }

    public static void printStudents() {
        for(Student s : students) {
            System.out.println("Name: "+s.getName());
            System.out.println("Username: "+s.getUsername());
            System.out.println("Modules:");
            for(Module m : s.getModules()) {
                System.out.println("\t"+m.getName());
            }
            System.out.println("Course(s):");
            for(CourseProgramme c : s.getCourses()) {
                System.out.println("\t"+c.getName());
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        //Create Students
        Student s1 = new Student("Elliott", new DateTime("1997-01-27"), 19384753);
        Student s2 = new Student("Angela", new DateTime("1996-08-11"), 19482057);
        Student s3 = new Student("Darlene", new DateTime("1999-04-05"), 17502857);
        Student s4 = new Student("Gideon", new DateTime("1967-07-15"), 19573948);
        Student s5 = new Student("Tyrell", new DateTime("1995-01-29"), 18572958);
        Student s6 = new Student("Jeff", new DateTime("1981-02-07"), 19439738);
        Student s7 = new Student("Britta", new DateTime("1988-02-26"), 19482057);
        Student s8 = new Student("Abed", new DateTime("1995-08-25"), 19473957);
        Student s9 = new Student("Troy", new DateTime("1995-04-15"), 18394857);
        Student s10 = new Student("Pierce", new DateTime("1955-08-17"), 14847583);
        Student s11 = new Student("Shirley", new DateTime("1975-09-13"), 18495837);
        Student s12 = new Student("Annie", new DateTime("1995-09-29"), 18578274);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
        students.add(s11);
        students.add(s12);

        //Create Modules
        Module m1 = new Module("Software Engineering");
        Module m2 = new Module("Machine Learning");
        Module m3 = new Module("Information Retrieval");
        Module m4 = new Module("Spanish");
        Module m5 = new Module("Anthropology");
        Module m6 = new Module("Biology");

        //Create Course Programmes
        CourseProgramme c1 = new CourseProgramme("GY350", new DateTime("2020-09-01"), new DateTime("2021-06-01"));
        CourseProgramme c2 = new CourseProgramme("Greendale", new DateTime("2020-09-01"), new DateTime("2021-06-01"));

        courses.add(c1);
        courses.add(c2);

        //Add Students to Modules
        for (Student s : Arrays.asList(s1, s2, s3, s4, s5)) {
            m1.addStudent(s);
            c1.addStudent(s);
        }
        for (Student s : Arrays.asList(s1, s2, s3, s4, s5)) {
            m2.addStudent(s);
            c1.addStudent(s);
        }
        for (Student s : Arrays.asList(s1, s2, s3, s4, s5)) {
            m3.addStudent(s);
            c1.addStudent(s);
        }
        for (Student s : Arrays.asList(s6, s7, s8, s9, s10, s11, s12)) {
            m4.addStudent(s);
            c2.addStudent(s);
        }
        for (Student s : Arrays.asList(s6, s7, s8, s9, s10, s11, s12)) {
            m5.addStudent(s);
            c2.addStudent(s);
        }
        for (Student s : Arrays.asList(s6, s7, s8, s9, s10, s11, s12)) {
            m6.addStudent(s);
            c2.addStudent(s);
        }

        //Add Modules to Course Programme
        for (Module module : Arrays.asList(m1, m2, m3)) {
            c1.addModule(module);
        }
        for (Module module : Arrays.asList(m4, m5, m6)) {
            c2.addModule(module);
        }

        printCourses();
        printStudents();
    }
}

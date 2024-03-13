package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Student student1 = new Student("Asim", new ArrayList<>());
        Student student2 = new Student("Johan", new ArrayList<>());
        Student student3 = new Student("Lasse", new ArrayList<>());
        student1.passedCourses.add("Programming");
        student2.passedCourses.add("System Development");
        student3.passedCourses.add("Java 1.0");


        Teacher teacher1 = new Teacher("Tess", new ArrayList<>());
        student1.currentCourses.add("Java 1.0");
        student2.currentCourses.add("Java 1.0");
        student3.currentCourses.add("Java 1.0");
        Teacher teacher2 = new Teacher("Signe", new ArrayList<>());

        teacher1.canTeach.add("Programming");
        teacher2.canTeach.add("Java 1.0");

        persons.add(student1);
        persons.add(student2);
        persons.add(student3);
        persons.add(teacher1);
        persons.add(teacher2);

        for (int i = 0; i < persons.size(); i++) {
            boolean added = persons.get(i).addCourse("Java 1.0");
            if (!added) {
                Person person = persons.get(i);
                if (person instanceof Student) {
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag.");
                }
            }
            if (added) {
                Person person = persons.get(i);
                if (person instanceof Student) {
                    System.out.println(person.getName() + " kan godt tage dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan godt undervise i dette fag");
                }
            }
        }

    }
}
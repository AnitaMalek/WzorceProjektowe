package sda.AAAStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TeachersFilter {

    static class Teacher{
        String name;
        String lastName;
        String subject;
        List<SchoolClass> schoolClass;

        public Teacher(String name, String lastName, String subject, List<SchoolClass> schoolClass) {
            this.name = name;
            this.lastName = lastName;
            this.subject = subject;
            this.schoolClass = schoolClass;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSubject() {
            return subject;
        }

        public List<SchoolClass> getSchoolClass() {
            return schoolClass;
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", subject='" + subject + '\'' +
                    ", schoolClass=" + schoolClass +
                    '}';
        }
    }

    static class SchoolClass {
        String name;
        String id;
        List<Student> students;

        public SchoolClass(String name, String id, List<Student> students) {
            this.name = name;
            this.id = id;
            this.students = students;
        }
    }

    static class Student {
        String name;
        String lastName;
        int id;

        public Student(String name, String lastName, int id) {
            this.name = name;
            this.lastName = lastName;
            this.id = id;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", id=" + id +
                    '}';
        }
    }

    public static void main(String[] args) {


        Student student1 = new Student("Ala", "Kot", 01);
        Student student2 = new Student("Ola", "Lis", 02);
        Student student3 = new Student("Ela", "Ptak", 03);
        Student student4 = new Student("Wojtek", "Kojot", 04);
        Student student5 = new Student("Tomek", "Miś", 05);


        SchoolClass schoolClass1 = new SchoolClass("Biologiczna", "A", Arrays.asList(student1, student2));
        SchoolClass schoolClass2 = new SchoolClass("Matematyczna", "B", Arrays.asList(student3, student4));
        SchoolClass schoolClass3 = new SchoolClass("Humanistyczna", "C", Arrays.asList(student5));

        Teacher teacher1 = new Teacher("Adam", "Małysz", "Biologia", Arrays.asList(schoolClass1));
        Teacher teacher2 = new Teacher("Robert", "Lewandowski", "Informatyka", Arrays.asList(schoolClass3));
        Teacher teacher3 = new Teacher("Maria", "Skłodowska", "Matematyka", Arrays.asList(schoolClass2));


        List<Teacher> teachers = Arrays.asList(teacher1, teacher2, teacher3);

        teachers.stream()
                .filter((Teacher t) -> {
                    return t.subject.contains("Biologia");
                })
                .forEach((Teacher t) -> {
                    System.out.println("Nauczyciele uczący biologii: " + "\n" + t);
                });
        teachers.stream()
                .flatMap((Teacher t) -> t.schoolClass.stream())
                .flatMap((SchoolClass s) -> s.students.stream())
                .forEach((Student st) -> {
                    System.out.println("Lista studemtów: " + st);
                });




/*String text = "    Piotr     ";

//        Stream.of(text)
//                .map((String txt) -> {
//                    return txt.trim();
//                })
//                .forEach((String txt) -> {
//                    System.out.println(txt);
//                });

        Stream.of(text)
                .map(String::trim)
                .forEach(System.out::println);*/

    }
}

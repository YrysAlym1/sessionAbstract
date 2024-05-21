package peaksoft;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Peaksoft {
    private String name;
    private String address;
    private Mentor[] mentors;
    private Student[] students;

    public Peaksoft() {
    }

    public Peaksoft(String name, String address, Mentor[] mentors, Student[] students) {
        this.name = name;
        this.address = address;
        this.mentors = mentors;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public void Menu() {
        System.out.println("""
                1.get All Mentors
                2.get All Students
                3.search by Student name
                4.search by Mentor email
                5.sort by student name
                6.student female or male gender
                """);
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                getAllMentors();
                break;
            case 2:
                getAllStudents();
                break;
            case 3:
                System.out.println(searchByStudentName());
                break;
            case 4:
                System.out.println(searchByMentorEmail());
                break;
            case 5:
                System.out.println(Arrays.toString(sortByStudentName()));
                break;
            case 6:
                System.out.println(Arrays.toString(femaleOrMale()));
                break;
        }
    }

    public void getAllMentors() {

        System.out.println(Arrays.toString(mentors));
        Menu();
    }

    public void  getAllStudents() {

        System.out.println(Arrays.toString(students));
        Menu();
    }

    public Student searchByStudentName() {
        System.out.println("Write student name: ");
        String name = new Scanner(System.in).nextLine();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public Mentor searchByMentorEmail() {
        System.out.println("Write email mentor: ");
        String email = new Scanner(System.in).nextLine();
        for (Mentor mentor : mentors) {
            if (mentor.getEmail().equals(email)) {
                return mentor;
            }
        }
        return null;
    }


    public Student[] femaleOrMale() {
        int maleCount = 0;
        int femaleCount = 0;
        System.out.println("""
                1.male
                2.female
                """);
        for (Student student : students) {
            if (student.getGender().equals("M")) {
                maleCount++;
            } else {
                femaleCount++;
            }
        }
        int index1 = 0;
        int index2 = 0;
        Student[] mStudent = new Student[maleCount];
        Student[] fStudent = new Student[femaleCount];
        return switch (new Scanner(System.in).nextInt()) {
            case 1 -> {
                for (Student student : students) {
                    if (student.getGender().equals("M")) {
                        mStudent[index1] = student;
                        index1++;
                    }
                }
                yield mStudent;
            }
            case 2 -> {
                for (Student student : students) {
                    if (student.getGender().equals("F")) {
                        fStudent[index2] = student;
                        index2++;
                    }
                }
                yield fStudent;
            }
            default -> null;
        };
    }
    public String [] sortByStudentName(){
        int index = 0;
        String [] arr = new String[students.length];
        Arrays.sort(students , Comparator.comparing(Student :: getName));
        for (Student student : students) {
            arr[index] = student.getName();
            index++;
        }
        return arr;
    }

}

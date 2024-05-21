package peaksoft;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Peaksoft peaksoft = get();


        peaksoft.Menu();

    }

    private static Peaksoft get() {
        Student student = new Student("Yryskeldi","M",18,"y@gmail.com");
        Student student1 = new Student("Orozbek","M",20,"o@gmail.com");

        Student student2 = new Student("Bek","M",22,"bek@gmail.com");
        Student student3 = new Student("Nazi","F",22,"nazi@gmail.com");

        Student [] students = {student,student1};
        Student [] students1 = {student2,student3};

        Student [] students2 = {student,student1,student2,student3};

        Group group1 = new Group("Java",students,1);
        Group group2 = new Group("JS",students1,2);

        Group [] groups = {group1,group2};


        Mentor mentor1 = new Mentor("Urmat","M","urma@gmail.com",groups);
        Mentor mentor2 = new Mentor("Nurkamil","M","nuri@gmail.com",groups);

        Mentor [] mentors = {mentor1,mentor2};

        return new Peaksoft("Peaksoft","chui",mentors,students2);
    }
}

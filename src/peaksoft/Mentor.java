package peaksoft;

import java.util.Arrays;

public class Mentor {
    private String name;
    private String gender;
    private String email;
    private Group [] groups;

    public Mentor(){}
    public Mentor(String name, String gender, String email, Group[] groups) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }



    public Group [] getAllGroups(){
        return groups;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email;
    }

    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("email: " + email);
    }
}

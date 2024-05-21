import java.time.LocalDate;

public class Student {
    private String name;
    private String sureName;
    private String gender;
    private LocalDate dateOfStart;
    private Educationcenter educationcenter;

    public Student(){}
    public Student(String name, String sureName, String gender, LocalDate dateOfStart, Educationcenter educationcenter) {
        this.name = name;
        this.sureName = sureName;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationcenter = educationcenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Educationcenter getEducationcenter() {
        return educationcenter;
    }

    public void setEducationcenter(Educationcenter educationcenter) {
        this.educationcenter = educationcenter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", educationcenter=" + educationcenter +
                '}';
    }
}

package model.student;

import java.io.Serializable;

public class Student extends BaseStudent implements Serializable {
    private String name;
    private String dob;
    private String homeLand;
    private String  id;

    public Student(String name, String dob, String homeLand, String id) {
        this.name = name;
        this.dob = dob;
        this.homeLand = homeLand;
        this.id = id;
    }

    public Student() {
    }

    @Override
    String getFullName() {
        return name;
    }

    @Override
    void setFullName(String name) {
        this.name=name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    void setId(String id) {
        this.id=id;
    }

    @Override
    String getDoB() {
        return dob;
    }

    @Override
    void setDoB(String doB) {
        this.dob=dob;
    }

    @Override
    String getHomeLand() {
        return homeLand;
    }

    @Override
    void setHomeLand(String homeLand) {
        this.homeLand=homeLand;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", homeLand='" + homeLand + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

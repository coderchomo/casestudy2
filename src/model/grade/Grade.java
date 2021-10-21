package model.grade;

import java.io.Serializable;

public class Grade extends BaseGrade implements Serializable {
    private String name;
    private String id;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id=id;
    }

    public Grade() {
    }

    public Grade(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

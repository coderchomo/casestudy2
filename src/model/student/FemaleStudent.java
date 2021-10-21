package model.student;

import java.io.Serializable;

public class FemaleStudent extends Student implements Serializable {
    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public void setFullName(String name) {
        super.setFullName(name);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getDoB() {
        return super.getDoB();
    }

    @Override
    public void setDoB(String doB) {
        super.setDoB(doB);
    }

    @Override
   public String getHomeLand() {
        return super.getHomeLand();
    }

    @Override
    public void setHomeLand(String homeLand) {
        super.setHomeLand(homeLand);
    }

    @Override
    public String toString() {
        return super.toString()+"Gender:Female";
    }

    public FemaleStudent(String name, String dob, String homeLand, String id) {
        super(name, dob, homeLand, id);
    }

    public FemaleStudent() {
    }
}

package model.grade;

import java.io.Serializable;

public class Grade12 extends Grade implements Serializable {
    public Grade12() {
    }

    public Grade12(String name, String id) {
        super(name, id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
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
    public String toString() {
        return super.toString()+"12";
    }
}

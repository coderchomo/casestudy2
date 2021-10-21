package model.student;

import model.grade.FactoryGrade;

public class FactoryStudent {
    private FactoryStudent(){}
    public static final Student getStudent(TypeStudent typeStudent,String name,String dob,String homeland,String id){
        switch (typeStudent){
            case FEMALESTUDENT:
                return new FemaleStudent(name,dob,homeland,id);
            case MALESTUDENT:
                return new MaleStudent(name,dob,homeland,id);
            default:
                throw new IllegalArgumentException("Not exist");
        }
    }
}

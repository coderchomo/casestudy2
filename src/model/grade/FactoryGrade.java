package model.grade;

public class FactoryGrade {
    private FactoryGrade(){}
    public static final Grade getGrade(TypeGrade typeGrade,String name,String id){
        switch (typeGrade){
            case GRADE10:
                return new Grade10(name, id);
            case GRADE11:
                return new Grade11(name,id);
            case GRADE12:
                return new Grade12(name,id);
            default:
                throw new IllegalArgumentException("Not exist");
        }
    }
}

package control;

import model.grade.Grade;
import storage.GradeStorage;

import java.util.List;

public class GradeManager implements IGeneralManager<Grade>{
    private List<Grade> gradeList;
    private GradeStorage gradeStorage;

    public GradeManager() {
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    public GradeStorage getGradeStorage() {
        return gradeStorage;
    }

    public void setGradeStorage(GradeStorage gradeStorage) {
        this.gradeStorage = gradeStorage;
    }

    @Override
    public List<Grade> findAll() {

        return gradeList;
    }

    @Override
    public void add(Grade grade) {
        gradeList.add(grade);
        gradeStorage.writeList(gradeList);
    }

    @Override
    public void edit(int index, Grade grade) {
        gradeList.set(index,grade);
        gradeStorage.writeList(gradeList);
    }

    @Override
    public void remove(int index) {
        gradeList.remove(index);
        gradeStorage.writeList(gradeList);
    }

    @Override
    public Grade searchById(String id) {
        Grade grade=null;
        for (int i = 0; i < gradeList.size(); i++) {
            if(gradeList.get(i).getId().equals(id)){
              grade=gradeList.get(i);
              break;
            }
        }return grade;
    }

    @Override
    public int searchIndexById(String id) {
        int index=-1;
        for (int i = 0; i < gradeList.size(); i++) {
            if(gradeList.get(i).getId().equals(id)){
                index=i;
                break;
            }
        }return index;
    }

    @Override
    public void showAll() {
        for (Grade ok:gradeList
             ) {
            System.out.println(ok);
        }
    }
}

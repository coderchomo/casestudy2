package storage;

import model.grade.Grade;
import model.student.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GradeStorage extends BaseStorage<Grade>{
    @Override
    public void writeList(List<Grade> list) {
        File file=new File("ListGrade.txt");
        try {
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Grade> readList() {
        List<Grade> gradeList=new ArrayList<>();
        File file=new File("ListGrade.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(file.length()==0){
            return new ArrayList<>();
        }
        try {
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            gradeList=(List<Grade>)ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return gradeList;
    }
}

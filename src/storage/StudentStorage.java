package storage;

import model.student.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentStorage extends BaseStorage<Student>{
    @Override
    public void writeList(List<Student> list) {
        File file=new File("ListStudent.txt");
        if(list==null){
            list=new ArrayList<>();
        }
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
    public List<Student> readList() {
        List<Student> studentList=new ArrayList<>();
        File file=new File("ListStudent.txt");
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
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}

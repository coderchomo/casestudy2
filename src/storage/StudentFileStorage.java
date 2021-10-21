package storage;

import model.studentFile.StudentFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFileStorage extends BaseStorage<StudentFile>{

    @Override
    public void writeList(List<StudentFile> list) {
        File file = new File("ListStudentFile.txt");
        try {
            FileOutputStream fos= new FileOutputStream(file);
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
    public List<StudentFile> readList() {
        List<StudentFile> studentFilesList=new ArrayList<>();
        File file=new File("ListStudentFile.txt");
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
            studentFilesList=(List<StudentFile>) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return studentFilesList;
    }
}

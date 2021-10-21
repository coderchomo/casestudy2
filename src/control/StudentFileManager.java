package control;

import model.grade.Grade;
import model.studentFile.StudentFile;
import storage.StudentFileStorage;

import java.util.List;

public class StudentFileManager implements IGeneralManager<StudentFile>{
    private List<StudentFile> studentFiles;
    private StudentFileStorage studentFileStorage;

    public StudentFileManager() {
    }

    public List<StudentFile> getStudentFiles() {
        return studentFiles;
    }

    public void setStudentFiles(List<StudentFile> studentFiles) {
        this.studentFiles = studentFiles;
    }

    public StudentFileStorage getStudentFileStorage() {
        return studentFileStorage;
    }

    public void setStudentFileStorage(StudentFileStorage studentFileStorage) {
        this.studentFileStorage = studentFileStorage;
    }

    public List<StudentFile> getStudentFileList() {
        return studentFileList;
    }

    public void setStudentFileList(List<StudentFile> studentFileList) {
        this.studentFileList = studentFileList;
    }

    private List<StudentFile> studentFileList;
    @Override
    public List<StudentFile> findAll() {
        return studentFileList;
    }

    @Override
    public void add(StudentFile studentFile) {
        studentFileList.add(studentFile);
        studentFileStorage.writeList(studentFileList);
    }

    @Override
    public void edit(int index, StudentFile studentFile) {
        studentFileList.set(index,studentFile);
        studentFileStorage.writeList(studentFileList);
    }

    @Override
    public void remove(int index) {
        studentFileList.remove(index);
        studentFileStorage.writeList(studentFileList);
    }

    @Override
    public StudentFile searchById(String id) {
      return null;
    }

    @Override
    public int searchIndexById(String id) {
        return 0;
    }
public int searchRealIndexById(int id){
        int index=-1;
    for (int i = 0; i < studentFileList.size(); i++) {
        if(studentFileList.get(i).getId()==id){
            index=i;
            break;
        }
    }return index;
}

    public StudentFile searchStudentFileById(int id) {
      StudentFile studentFile=null;
        for (int i = 0; i < studentFileList.size(); i++) {
            if(studentFileList.get(i).getId()==id){
                studentFile=studentFileList.get(i);
                break;
            }
        }return studentFile;
    }

    @Override
    public void showAll() {
        for (StudentFile studentFile:studentFileList
             ) {
            System.out.println(studentFile);
        }
    }
}

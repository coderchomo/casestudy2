package control;



import model.student.Student;
import storage.StudentStorage;

import java.util.List;

public class StudentManager implements IGeneralManager<Student>{
    private List<Student> studentList;
    private StudentStorage studentStorage;

    public StudentManager() {
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentStorage getStudentStorage() {
        return studentStorage;
    }

    public void setStudentStorage(StudentStorage studentStorage) {
        this.studentStorage = studentStorage;
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
        studentStorage.writeList(studentList);
    }

    @Override
    public void edit(int index, Student student) {
        studentList.set(index, student);
        studentStorage.writeList(studentList);
    }

    @Override
    public void remove(int index) {
        studentList.remove(index);
        studentStorage.writeList(studentList);
    }

    @Override
    public Student searchById(String  id) {
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId().equals(id)){
               return studentList.get(i);
            }
        }return null;
    }

    @Override
    public int searchIndexById(String id) {
        int index=-1;
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId().equals(id)){
                index=i;
              break;
            }
        }
        return index;
    }

    @Override
    public void showAll() {
        for (Student a:studentList
             ) {
            System.out.println(a);
        }
    }
}

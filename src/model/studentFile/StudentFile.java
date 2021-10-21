package model.studentFile;

import model.grade.Grade;
import model.student.Student;

import java.io.Serializable;

public class StudentFile extends BaseStudentFile implements Serializable {
    private int id;
    private Student student;
    private Grade grade;

    public StudentFile(int id, Student student, Grade grade) {
        this.id = id;
        this.student = student;
        this.grade = grade;
    }

    public StudentFile() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id=id;
    }

    @Override
    public Student getStudent() {
        return student;
    }

    @Override
    public void setStudent(Student student) {
        this.student=student;
    }

    @Override
    public Grade getGrade() {
        return grade;
    }

    @Override
    public void setGrade(Grade grade) {
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "StudentFile{" +
                "id=" + id +
                ", student=" + student +
                ", grade=" + grade +
                '}';
    }

}

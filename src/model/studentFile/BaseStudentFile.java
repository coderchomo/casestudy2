package model.studentFile;

import model.grade.Grade;
import model.student.Student;

public abstract class BaseStudentFile {
    abstract int getId();
    abstract void setId(int id);
    abstract Student getStudent();
    abstract void setStudent(Student student);
    abstract Grade getGrade();
    abstract void setGrade(Grade grade);
}

package view;

import control.GradeManager;
import control.StudentFileManager;
import control.StudentManager;
import model.grade.FactoryGrade;
import model.grade.Grade;
import model.grade.Grade10;
import model.grade.TypeGrade;
import model.student.FactoryStudent;
import model.student.FemaleStudent;
import model.student.Student;
import model.student.TypeStudent;
import model.studentFile.StudentFile;
import storage.GradeStorage;
import storage.StudentFileStorage;
import storage.StudentStorage;
import view.menu.Menu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("i got a B, i got an eng....ughhhh ....b-e-n-g");
        System.out.println("   *  ****  ****");
        System.out.println("  **     *  *  *");
        System.out.println("****  ****  *  *");
        System.out.println("   *  *     *  *");
        System.out.println("   *  ****  ****");
    Menu menu=new Menu();
    menu.menu();
    }
}

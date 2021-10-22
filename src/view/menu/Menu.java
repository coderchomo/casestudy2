package view.menu;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import control.GradeManager;
import control.StudentFileManager;
import control.StudentManager;
import model.grade.Grade;
import model.student.FactoryStudent;
import model.student.FemaleStudent;
import model.student.Student;
import model.student.TypeStudent;
import model.studentFile.StudentFile;
import storage.GradeStorage;
import storage.StudentFileStorage;
import storage.StudentStorage;

import java.util.List;
import java.util.Scanner;

public class Menu {
     private static  StudentFileManager studentFileManager=new StudentFileManager();
    private static StudentManager studentManager=new StudentManager();

    public static void menu() {

        GradeManager gradeManager=new GradeManager();


        GradeStorage gradeStorage=new GradeStorage();
        StudentStorage studentStorage=new StudentStorage();
        StudentFileStorage studentFileStorage=new StudentFileStorage();

        studentManager.setStudentStorage(studentStorage);
        List<Student> studentList=studentStorage.readList();
        studentManager.setStudentList(studentList);

        gradeManager.setGradeStorage(gradeStorage);
        List<Grade> gradeList=gradeStorage.readList();
        gradeManager.setGradeList(gradeList);

        studentFileManager.setStudentFileStorage(studentFileStorage);
        List<StudentFile> studentFileList=studentFileStorage.readList();
        studentFileManager.setStudentFileList(studentFileList);
       
        while (true) {
            System.out.println("Happy new year");
            System.out.println("1.Add Student");
            System.out.println("2.Edit Student");
            System.out.println("3.Remove Student");
            System.out.println("4.Display Student");
            System.out.println("5.Search Student By Id");
            System.out.println("Choose some thing");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Student student = creatNewStudent();
                    studentManager.add(student);
                    break;
                case 2:
                    int index = getIndexStudent();
                    Student student1 = creatNewStudent();
                    studentManager.edit(index,student1);
                    break;
                case 3:
                    int index1 = getIndexStudent();
                    studentManager.remove(index1);
                case 4:
                    studentManager.showAll();
                    break;
                case 5:
                    searchStudentById();
                    break;
                case 420:
                    System.out.println("Winner winner chicken dinner");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("choose again");

            }
        }
    }

    private static int getIndexStudent() {
        System.out.println("enter the index of studentlist");
        Scanner inputIndex=new Scanner(System.in);
        return inputIndex.nextInt();
    }

    private static Student creatNewStudent() {
        System.out.println("Enter student name:");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        System.out.println("Enter student date of birth: ");
        Scanner inputDob=new Scanner(System.in);
        String dob = inputDob.nextLine();
        System.out.println("Enter student homeland: ");
        Scanner inputHomeland=new Scanner(System.in);
        String homeland=inputHomeland.nextLine();
        System.out.println("Enter Id");
        Scanner inputId=new Scanner(System.in);
        String id=inputId.nextLine();
        System.out.println("Enter gender");
        Scanner inputGender=new Scanner(System.in);
        String gender=inputGender.nextLine();
        Student student=new Student();
        if (gender.equals("Male")){
            student= FactoryStudent.getStudent(TypeStudent.MALESTUDENT,name,dob,homeland,id);
        }else if(gender.equals("Female")){
            student=FactoryStudent.getStudent(TypeStudent.FEMALESTUDENT,name,dob,homeland,id);
        }else{
            System.err.println("Not exist");
        }
        return student;
    }

    public static void addStudent() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name");
        String name=scanner.nextLine();
    }
    public static void searchStudentById(){
        System.out.println("Enter Student Id");
        Scanner scanner=new Scanner(System.in);
        String id= scanner.nextLine();
        Student student= studentManager.searchById(id);
        System.out.println(student.toString());
    }
}

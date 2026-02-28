import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private String courseName;
    private ArrayList<Student> courseStudent = new ArrayList<Student>();
    private static int numberOfStudent;

    Scanner input = new Scanner(System.in);
    public Course(){
        courseName = "No Title";
        numberOfStudent=0;
    }
    public Course(String courseName){
       setCourseName(courseName);
       numberOfStudent=0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public static int getNumberOfStudent() {
        return numberOfStudent;
    }

    public static void setNumberOfStudent(int numberOfStudent) {
        Course.numberOfStudent = numberOfStudent;
    }

    public void addNewStudent(){
        Student s1 = new Student();
        System.out.println("Enter The Number of Student");
        s1.setNumbere(input.nextInt());
        System.out.println("Enter The Name of Student");
        s1.setName(input.next());

        courseStudent.add(s1);
        numberOfStudent++;
        System.out.println("The Student Is Add Success");
    }
    public void addNewStudent(int number , String name) {
        Student s2 = new Student(number, name);
        courseStudent.add(s2);
        numberOfStudent++;
        System.out.println("The Student Is Add Success");
    }

    public boolean dropStudent(int x){
        for (int i = 0; i < courseStudent.size(); i++) {
            if (courseStudent.get(i).getNumbere() == x){
                courseStudent.remove(i);
                numberOfStudent--;
                return true;
            }
        }
        return false;
    }

    public void printAllCourse(){
        System.out.println("Course Name : " + getCourseName());
        System.out.printf("%-10s%-30s%n" , "Number" , "Name");
        for (int i = 0; i < courseStudent.size(); i++) {
            System.out.printf("%-10d" , courseStudent.get(i).getNumbere());
            System.out.printf("%-30s%n" , courseStudent.get(i).getName());
        }
        System.out.println("Total Student : " + getNumberOfStudent());
    }
    public void changeCourseName(){
        System.out.println("The Change Course Name : ");
        setCourseName(input.next());
        printAllCourse();
    }
   }

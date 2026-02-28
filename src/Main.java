import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Course c = new Course();
        c.setCourseName("Java");
        c.addNewStudent(1 , "Omar");
        c.addNewStudent(2 , "Ali");
        c.addNewStudent(3, "Sara");

        String choice = "!";
        do {
            drowMenu();
            choice = input.next();
            switch (choice){
                case "A": case "a":
                    System.out.println("Add A New Student");
                    c.addNewStudent();
                    c.printAllCourse();
                    break;

                case "D": case "d":
                    System.out.println("Drop A New Student");
                    System.out.println("Enter The Student Number You Want To Drop !");
                    int num = input.nextInt();
                    c.dropStudent(num);
                    c.printAllCourse();
                    break;
                case "C": case "c":
                    System.out.println("Change The Course Name");
                    c.changeCourseName();
                    c.printAllCourse();
                    break;
                case "P": case "p":
                    System.out.println("Print All Course Student");
                    c.printAllCourse();
                case "E": case "e":
                   System.exit(0);
            }
        }while (! choice.equalsIgnoreCase("E"));
    }
    public static void drowMenu(){
        System.out.println("What World you like To Do :");
        System.out.println("A - Add A New Student");
        System.out.println("D - Drop A Student From The Course");
        System.out.println("C - Change Course Name");
        System.out.println("P - Print All Course Information");
        System.out.println("E - Exit");
        System.out.println("Enter The Choice Number Please : ");
    }
}
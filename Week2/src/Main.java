import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //The following program illustrates the use of some methods in the String class.
        Scanner input = new Scanner(System.in);
        String courseList = "CMPE113 CMPE114 CMPE223 CMPE224";
        System.out.println(courseList.substring(0,15));
        String text = courseList.concat("CMPE113 CMPE114");
        System.out.println(text);
        String course1 = courseList.substring(0,7);
        String course2 = courseList.substring(8,15);
        String course3 = courseList.substring(16,23);
        String course4 = courseList.substring(24,31);
        System.out.println(course4+course3+course2+course1);
        System.out.println("Enter a course: ");
        String name = input.next();
        String text2 = courseList.concat(" "+name);
        text2 = text2.replace(" ","*");
        System.out.println(text2);
    }
}
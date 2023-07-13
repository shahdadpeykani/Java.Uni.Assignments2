import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class ColorSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("RED");
        strArr.add("BLUE");
        while (true) {
            System.out.println("\nEnter a color name: ");
            String name = input.next();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            strArr.add(name.toUpperCase());
            Collections.sort(strArr);
            Collections.reverse(strArr);
            for(String element:strArr){
                System.out.print(element+" ");
            }
        }

        }
    }

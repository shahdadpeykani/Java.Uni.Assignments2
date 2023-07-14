import java.util.Scanner;
public class Recursion {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    public static int findGCD(int[] numb, int index) {
        if (index == numb.length - 1) {
            return numb[index];
        }
        return findGCD(numb[index], findGCD(numb, index + 1));
    }

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the integers: ");
            String input = scan.nextLine();
            String[] numbersStr = input.split(" ");
            int[] numbers = new int[numbersStr.length];

            for (int i = 0; i < numbersStr.length; i++) {
                numbers[i] = Integer.parseInt(numbersStr[i]);
            }

            int gcd = findGCD(numbers, 0);
            System.out.println("Output: " + gcd);

        } catch (NumberFormatException e) {
            throw new RuntimeException("This is not a number");
        }
    }
}
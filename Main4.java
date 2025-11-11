import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
    import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        System.out.println("The reverse of the number is: " + reverse);
        input.close();
    }
}

    }
}

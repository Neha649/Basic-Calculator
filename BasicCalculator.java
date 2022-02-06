import java.util.Scanner;

public class BasicCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value:");
        String input1 = sc.nextLine();
        Integer x = Integer.parseInt(input1);

        System.out.println("Enter 2nd value:");
        String input2 = sc.nextLine();
        Integer y = Integer.parseInt(input2);

        
        System.out.println("Sum = "+(x + y));
    }
}
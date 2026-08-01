import java.util.Scanner;

public class Swapwithout3rd {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("the first no is: ");
        int a = in.nextInt();
        System.out.print("the second no is : ");
        int b = in.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("the first no became "+a);
        System.out.println("the second no became "+b);
    }
}

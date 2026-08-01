import java.util.Scanner;

public class calculation {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int diffrence = a-b;
        int product = a*b;
        System.out.println("The sum of 2 no is = "+sum);
        System.out.println("the difference of 2 no is = "+diffrence);
        System.out.println("the product of 2 no is = "+product);
    }
}

import java.util.Scanner;

public class EvenOdd {
    static void main() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a%2==0){
            System.out.println("The given no is even = "+a);}
            else{
                System.out.println("The given no is odd = "+a);
            }
        }
    }


import java.util.Scanner;

public class AgeCalculator {
    static void main() {
        Scanner in =new Scanner(System.in);
        System.out.print("Tell birthyear : ");
        int birthyear = in.nextInt();
        System.out.print("Tell birthdate : ");
        int birthdate = in.nextInt();
        System.out.print("Tell birthmonth : ");
        int birthmonth=in.nextInt();
        int year = 2026;
        int month=7;
        int date =10;
        int age = year-birthyear;
        int months = month-birthmonth;
        int days = date-birthdate;
        if (days<0)
        {
            days = days +30;
            months--;
        }
        if (months <0){
            months = months + 12;
            age--;
        }
        System.out.println("The age of the person is : "+age+"years "+ months+"months " + days+"days ");
    }
}

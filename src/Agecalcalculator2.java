import java.util.Scanner;

public class Agecalcalculator2 {
    static void main() {
                Scanner in = new Scanner(System.in);

                System.out.print("Enter birth year: ");
                int birthYear = in.nextInt();

                System.out.print("Enter birth month: ");
                int birthMonth = in.nextInt();

                System.out.print("Enter birth date: ");
                int birthDate = in.nextInt();

                System.out.print("Enter current year: ");
                int currentYear = in.nextInt();

                System.out.print("Enter current month: ");
                int currentMonth = in.nextInt();

                System.out.print("Enter current date: ");
                int currentDate = in.nextInt();

                int age = currentYear - birthYear;
                int months = currentMonth - birthMonth;
                int days = currentDate - birthDate;

                // Adjust days if current date is smaller than
                if (days < 0) {
                    days = days + 30; // assuming a month has 30 days
                    months--;
                }

                // Adjust months if current month is smaller than birth month
                if (months < 0) {
                    months = months + 12;
                    age--;
                }

                System.out.println("Your age is: " + age + " years "
                        + months + " months " + days + " days");
            }
        }
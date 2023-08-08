import java.util.Scanner;

public class LeapYear { // having 366 days in a year

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Year ");
        int year = sc.nextInt();

        boolean isLeapYear = (year % 400 == 0) || (year % 4 ==0 && year % 100 !=0);

        if (isLeapYear)
        {
            System.out.println(year+" is Leap year");
        }
        else
        {
            System.out.println(year+" is not Leap Year");
        }

    }
}

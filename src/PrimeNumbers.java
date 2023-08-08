import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");    //2,3,5,7,9,11,13,17,19,23,29 etc

        int number = sc.nextInt();

        int factor = 0;                     //boolean isPrime= true;
        for (int i=2; i<= number/2; i++)   // i<=Math.sqrt(number)
        {
            if(number % i == 0)
            {
                factor++;                  // isPrime= false;
                                          // break;
            }
        }

        if (factor == 0) {
            System.out.println(number + " is a prime number");
        }
        else {
            System.out.println(number + " is not a prime number");
        }

    }
}

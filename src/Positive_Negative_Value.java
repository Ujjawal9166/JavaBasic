import java.util.Scanner;

public class Positive_Negative_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");

        int num = sc.nextInt();

        if (num >=0){
            System.out.println(num+ " is a Positive number");
        }
        else {
            System.out.println(num+ " is a Negative number");
        }
    }
}

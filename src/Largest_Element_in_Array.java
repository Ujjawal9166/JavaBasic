import java.util.Scanner;

public class Largest_Element_in_Array {
    public static void main(String[] args) {
//        int a[]=new int[4];
//        Scanner s= new Scanner(System.in);
//        System.out.println("Enter elements");
//        for(int i=0;i<4;i++)
//        {
//            a[i]=s.nextInt();
//
//        }
//        System.out.println();


        int a[] = {10,20,45,12,56};

        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("largest element in array: "+max);
    }
}

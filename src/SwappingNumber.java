public class SwappingNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        a=a+b;
//        b=a-b;
//        a=a-b;
//
//        System.out.println("after swapping Value of a is: "+a+" b is "+b);

//          a=a*b;
//          b=a/b;
//          a=a/b;
//
//          System.out.println("after swapping Value of a is: "+a+" b is "+b);

          b=a+b-(a=b);
          System.out.println("after swapping Value of a = "+a+", b = "+b);
    }
}

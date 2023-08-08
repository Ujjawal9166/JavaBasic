public class ReverseString {
    public static void main(String[] args) {

        String str = "My Name is Ujjawal singh";  // hgnis lawajjU si emaN yM

        String reverse = "";

        int str1 =  str.length();

        for (int i = str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);

        }
        System.out.println(reverse);

//=======================================================================================
        String str2 = "Bhopal is a capital of Madhyapradesh"; // lapohB si a latipac fo hsedarpayhdaM

        String[] word = str2.split(" ");
        str2 = "";
        for(String w : word) {
            String revstr = "";

            for(int i = w.length()-1; i >= 0; i--){
                revstr += w.charAt(i);
        }

            str2+=revstr + " ";

        }
        System.out.println(str2);


//===========================================================================================
        String s = "Indore is a cleanest city"; // city cleanest a is Indore
        String[] s1 = s.split(" ");
        for (int i = s1.length-1; i >= 0; i--) {

            System.out.print(s1[i]+" ");

        }



    }
}

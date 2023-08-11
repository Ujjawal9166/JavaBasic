public class Check_StringsAreSame_Ignore_Case {
    public static void main(String[] args) {
        String str1 = "How Are You";
        String str2 = "how are you";

        boolean areStringSame = str1.equalsIgnoreCase(str2);
        System.out.println("Are the strings same ignoring their cases: "+areStringSame);
    }
}

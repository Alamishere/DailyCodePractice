package DailyCodePractice;
public class reverseString {
      public static String reverseStrings(String s) {
     if (s.length() ==0){
       return "";
     }
    return reverseStrings(s.substring(1)) + s.charAt(0);
  }

  public static void main(String[] args) {
    String s="Hello";
    System.out.println(reverseStrings(s));
  }
    
}

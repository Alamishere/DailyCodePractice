package DailyCodePractice;
public class reversePalnidrome {
    public static boolean palindrome(String s){
      if(s.length() <=1){
      return true;
    }
    if(s.charAt(0) != s.charAt(s.length()-1)){
      return false;
    }
    return palindrome(s.substring(1, s.length()-1));
  
    }
    public static void main(String [] args){
        String s1 ="pop";
        String s2= "kayak";

        System.out.println(palindrome(s1));
        System.out.println(palindrome(s2));
    }

}

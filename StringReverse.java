package DailyCodePractice;
public class StringReverse {
    public static String reverse(String s){
        String reverseString="";
        char ch;
    for(int i=0;i<s.length();i++){
            ch= s.charAt(i);
            reverseString= ch+ reverseString;
    }
    return reverseString;
    }
    
    public static void main(String[] args) {
        String s= "UNKNOWNUSER";
        System.out.println(reverse(s));
    }
}
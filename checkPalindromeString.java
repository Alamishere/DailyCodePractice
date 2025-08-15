package DailyCodePractice;
public class checkPalindromeString {
    boolean checkPalindrome(String input){
        int length = input.length();

        for(int i=0; i< length/2;i++){
            if(input.charAt(i) != input.charAt(length-i-1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        checkPalindromeString cp = new checkPalindromeString();
        String  word = "MEM";
        System.out.println("Is the word "+ word+  " Palindrome: "+ cp.checkPalindrome(word));
    }
    
}

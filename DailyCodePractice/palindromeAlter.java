package DailyCodePractice;
public class palindromeAlter {
    boolean checkPalindromeString(String input) {
        int length= input.length();
        for(int i=0;i<length/2;i++){
            if(input.charAt(i)!= input.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        palindromeAlter pa = new palindromeAlter();
        String word= "mAdam";
        System.out.println(pa.checkPalindromeString(word));
    }
    
}

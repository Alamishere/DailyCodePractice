package DailyCodePractice;

public class palindrome {
    public boolean result(String s){
        if(s.isEmpty() || s==null){
            return true;
        }

        int start=0;
        int end= s.length()-1;

        while(start<= end){
            char First = s.charAt(start);
            char End= s.charAt(end);

            if(!Character.isLetterOrDigit(First)){
                start++;
            }
            else if(!Character.isLetterOrDigit(End)){
                end--;
            }else{
                if(Character.toLowerCase(First)!= Character.toLowerCase(End)){
                    return false;
                }
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String [] args) {
		palindrome ps = new palindrome();
		String word ="BHODAI";
		System.out.println("Is the word "+ word+ " palindrome? "+ ps.result(word));
	}
    
}

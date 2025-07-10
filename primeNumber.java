package DailyCodePractice;
import  java.lang.Math;

public class primeNumber {
    public boolean solution(int n){
        if(n<2){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        primeNumber pNumber = new primeNumber();
        int number=25;
        System.out.println("Is " +number+" prime? "+pNumber.solution(number));
    }
    
}

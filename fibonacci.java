package DailyCodePractice;
public class fibonacci {
    public static int fbc(int n){
        if (n==0 || n==1){
            return n;
        }
        return fbc(n-1)+fbc(n-2);
    }

    public static void main(String[] args) {
        int value =8;
        for(int i=0;i<value;i++){
            System.out.print(fbc(i)+" ");
        }
        System.out.println("Fibonacci Seq is "+ fbc(value));
        
    }
    
}

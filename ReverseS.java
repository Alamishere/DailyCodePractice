package DailyCodePractice;
public class ReverseS {
    public static void main(String[] args) {  
    String rs="MANLY";
    char ch;
    String s="";

    for(int i=0;i<rs.length();i++){
        ch = rs.charAt(i); 
    s = ch + s;
    }
    System.out.println(s);
    
}
}
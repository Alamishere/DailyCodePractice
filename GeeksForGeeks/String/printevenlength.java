package GeeksForGeeks.String;
/*Input: s = "This is a java language"
Output: This is  java language
Explanation: All the elements with the length even are printed. 
"This" length is 4 so printed whereas "a" length is 1 so not Printed.   */

public class printevenlength {
    public static void main(String [] args){
            String s = "This is a java language";
            String [] part= s.split(" ");
            for(String words:part){
                if(words.length()%2==0){
                    System.out.print(words+" ");
                }
            }

    }
    
}

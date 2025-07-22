package DailyCodePractice;
public class makeFancyString {
    public String makeString(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int count=1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            } else{
                count =1;
            }
            if(count<3){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

     public static void main(String[] args) {
        makeFancyString sol = new makeFancyString();

        String input1 = "leeetcode";
        String input2 = "aaabaaa";
        String input3 = "aab";
        String input4 = "aaa";

        System.out.println("Input: " + input1 + " → Output: " + sol.makeString(input1)); 
        System.out.println("Input: " + input2 + " → Output: " + sol.makeString(input2)); 
        System.out.println("Input: " + input3 + " → Output: " + sol.makeString(input3)); 
        System.out.println("Input: " + input4 + " → Output: " + sol.makeString(input4)); 
    }

}

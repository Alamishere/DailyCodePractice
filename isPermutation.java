import java.util.Arrays;

public  class isPermutation{
    public boolean isP(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[]s3= s1.toCharArray();
        char[]s4= s2.toCharArray();

        Arrays.sort(s3);
        Arrays.sort(s4);

        return Arrays.equals(s3, s4);
    }

    public static void main(String [] args){
        isPermutation isp = new isPermutation();
        String s1= "panama";
        String s2= "panama";

        System.out.println(isp.isP(s1,s2));
    }
}
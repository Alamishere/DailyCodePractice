/*Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
Function Description.Complete the getSmallestAndLargest function in the editor below.
getSmallestAndLargest has the following parameters:
string s: a string
int k: the length of the substrings to find
Returns
string: the string ' + "\n" + ' where and are the two substrings
Input Format
The first line contains a string denoting .
The second line contains an integer denoting .*/

import java.util.Scanner;

public class subStringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for(int i=0; i<= s.length()-k;i++){
            String substr = s.substring(i,i+k);
            if (smallest.equals("") || substr.compareTo(smallest) < 0) {
            smallest = substr;
        }
        if (largest.equals("") || substr.compareTo(largest) > 0) {
            largest = substr;
        }

        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
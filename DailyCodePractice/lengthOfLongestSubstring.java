package DailyCodePractice;

import java.util.HashSet;
import java.util.Set;

/*Given a string s, find the length of the longest substring without duplicate characters. 
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
*/
public class lengthOfLongestSubstring {
    public int longestSubstring(String s){
        Set<Character> charSet = new HashSet<>();
        int left=0;
        int maxLength=0;

        for(int right=0; right<s.length();right++){
            while(charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
            }
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring solution = new lengthOfLongestSubstring();

        String input = "bbbbbbb";
        int result = solution.longestSubstring(input);

        System.out.println("Input: " + input);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
    
}

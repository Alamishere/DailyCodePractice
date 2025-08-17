package DailyCodePractice;
/*Given a string s, return a Map<Character, Integer> containing the number of times each character appears in the string.
Example:
Input: s = "aabbcc"
Output: {a=2, b=2, c=2} */

import java.util.HashMap;

public class frequencyCounter {
    public HashMap<Character,Integer> frequencycounter(String s){
        HashMap<Character,Integer> freqMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(freqMap.containsKey(chars[i])){
            int value= freqMap.get(chars[i]);
            freqMap.put(chars[i],value+1);
        }else{
            freqMap.put(chars[i],1);
        }
    }
return freqMap;
}
    public static void main(String[] args) {
        frequencyCounter tesCounter = new frequencyCounter();
        String word = "abbccsseerrfdsdsddd";
        System.out.println(tesCounter.frequencycounter(word));
    }
}

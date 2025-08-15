package DailyCodePractice;
/*Write a method, longestWord, that takes in a sentence string as an argument. 
The method should return the longest word in the sentence. If there is a tie, 
return the word that occurs later in the sentence.
You can assume that the sentence is non-empty. */
public class LongestWord { 
    public static String longWord(String sentence){
        String[] words= sentence.split("\\s+");
            String longest="";
        
            for(String word: words){
                if(word.length()>= longest.length()){
                    longest=word;
                }
            }

            return longest;
    }

    public static void main(String[] args) {
        String sentence=" What a beautiful day it is!";
        System.out.println("Longest word is "+ longWord(sentence));
    }

}

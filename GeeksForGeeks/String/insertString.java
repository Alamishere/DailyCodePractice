/*Input: originalString = "GeeksGeeks", 
            stringToBeInserted = "For", 
            index = 4
Output: "GeeksForGeeks"
Explanation: Adding the new String to orignal String at the index given.
 */
package DailyCodePractice.GeeksForGeeks.String;
public class insertString {
    public static void main(String[] args) {
        String originalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 5;
        String newString = originalString.substring(0, index) 
                         + stringToBeInserted 
                         + originalString.substring(index);

        System.out.println(newString);
    }
}

    

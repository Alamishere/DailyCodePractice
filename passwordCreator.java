package DailyCodePractice;
/*String Challenge
Have the function StringChallenge(str) take the str parameter being passed and determine if it passes as a valid password that follows this list of constraints:
Password Requirements:

It must have a capital letter.
It must contain at least one number.
It must contain a punctuation mark or mathematical symbol.
It cannot have the word "password" in the string.
It must be longer than 7 characters and shorter than 31 characters.

Return Value:

If all the above constraints are met within the string, your program should return the string true, otherwise your program should return the string false.

Examples:

Input: "passWord123!!!"
Output: false (contains "password")
Input: "turkey90AAA"
Output: true

Note: For example: if str is "appleM7!" then your program should return "true".
The function should validate each requirement sequentially and return the original string if valid, or "false" if any requirement fails. */

public class passwordCreator {

    public static String StringChallenge(String str) {
        if (str == null) return "false";
        if (str.length() < 7 || str.length() > 31 || str.toLowerCase().contains("password")) {
            return "false";
        }

        boolean isCapital = false;
        boolean isNumber = false;
        boolean doesPunctuation = false;

        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') isCapital = true;
            if (ch >= '0' && ch <= '9') isNumber = true;
            if (!Character.isLetterOrDigit(ch)) doesPunctuation = true;
        }

        return (isCapital && isNumber && doesPunctuation) ? "true" : "false";
    }

    public static void main(String[] args) {
        String[] tests = {
            "Abcdef1!",          
            "abcdef1!",          
            "Abcdef1!password"   
        };

        for (String test : tests) {
            System.out.println("Input: " + test + " → Output: " + StringChallenge(test));
        }
    }
}

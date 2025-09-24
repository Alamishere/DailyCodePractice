public class hasUniqueChars {
    public static boolean isUnique(String str) {
        if (str == null) return true;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testStrings = {
            "abcdefg",
            "hello",
            "programming",
            "",
            "a",
            (String) null 
        };

        for (String test : testStrings) {
            System.out.println("String: \"" + test + "\"");
            System.out.println("BruteForce: " + hasUniqueChars.isUnique(test));
            System.out.println();
        }
    }
}

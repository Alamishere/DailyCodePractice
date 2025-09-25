public class URLify {

    public static void urlify(char[] str, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        int newLength = trueLength + spaceCount * 2;
        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength -= 3;
            } else {
                str[newLength - 1] = str[i];
                newLength--;
            }
        }
    }

    public static void main(String[] args) {
        String s = "Mr John Smith    "; 
        char[] arr = s.toCharArray();
        int trueLength = 13;

        urlify(arr, trueLength);

        System.out.println("\"" + new String(arr) + "\"");
    }
}

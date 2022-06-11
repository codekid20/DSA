package array;

public class URLify {
    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        System.out.println(urlIfy(str.toCharArray(), str.length()));
    }

    private static String urlIfy(char[] str, int length) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        index = length + spaceCount*2;
        if (length < str.length) {
            str[length] = '\0';
        }
        for (i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
        return new String(str);
    }
}

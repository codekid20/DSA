package array;

import java.util.Arrays;
import java.util.Iterator;


public class permutation {
    public static void main(String[] args) {
        String str1 = "bct";
        String str2 = "tab";

//        System.out.println(isPermutation(str1, str2));
        System.out.println(isPermutation_1(str1, str2));
    }

    private static boolean isPermutation_1(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] letters = new int[128];

        char[] s_arr = str1.toCharArray();
        for(char c : s_arr) {
            letters[c]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            int c = (int) str2.charAt(i);
            letters[c]--;

            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }

    // METHOD 1
    private static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        return sort(str1).equals(sort(str2));

    }

    private static String sort(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

}

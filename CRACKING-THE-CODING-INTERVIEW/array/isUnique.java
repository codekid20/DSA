package array;

public class isUnique {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(Unique(str));
    }

    private static boolean Unique(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] arr = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);

            if (arr[value]) {
                return false;
            }
            arr[value] = true;
        }
        return true;
    }

    // METHOD 2
//    private static boolean Unique_1(String str) {
//
//    }

}

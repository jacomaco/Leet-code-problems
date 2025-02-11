public class ReverseString {
    public String reverseString(String str) {
        /*
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = length - 1; i > -1; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
        */

        // most efficient
        char[] chars = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);

        // easiest to implement
        /*
         * return nes StringBuilder(str).revers().toString();
         */
    }
}

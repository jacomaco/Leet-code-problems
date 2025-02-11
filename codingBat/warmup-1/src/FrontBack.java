public class FrontBack {
    public String frontBack(String str) {
        if (str.length() == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        int length  = str.length() - 1;
        char temp = chars[0];
        chars[0] = chars[length];
        chars[length] = temp;
        return new String(chars);
    }
}

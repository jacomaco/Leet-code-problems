public class MissingChar {
    public String missingChar(String str, int n) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (i == n) {
                continue;
            }
            sb.append(str.charAt(i));
        }    
        return sb.toString();
    }
}

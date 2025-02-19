public class Front22 {
    public String front22(String str) {
        String newString = "";
        if (str.length() < 2) {
            newString = str + str + str;
            return newString;
        } else {
            
            String substring = str.substring(0, 2);
            newString = substring + str + substring;
            return newString;
        }
    }
}

public class BackAround {
    public String backAround(String str ) {
        // if (str.lengt() < 1) {return -1;};
        String midString = str.substring(0,str.length());
        char newChar = str.charAt(str.length() - 1);
        return new String(newChar + midString + newChar);
    }

}

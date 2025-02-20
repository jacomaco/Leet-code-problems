public class StartHi {
    public boolean startHi(String str) {
        if (str.length() >= 2) {
            return str.substring(0,2).equals("hi");
        }
        else {
            return false;
        }
    }
}

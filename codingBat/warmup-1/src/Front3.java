public class Front3 {
    public String front3(String str ){
        StringBuilder sb = new StringBuilder();
        String front;
        
        front = (str.length() < 3) ? str.substring(0, str.length()) : str.substring(0, 3);
        
        for (int i = 0; i < 3; i++) {
            sb.append(front);
        }
        return new String(sb);
    }

}

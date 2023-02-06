public class pangram {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] strCh = str.toCharArray();
        char[] strArr = new char[26];
        boolean t = true;
        for (int i = 0; i<strCh.length; i++){
            strArr[strCh[i] - 65]++;
        }
        for (int i = 0; i<strArr.length; i++){
            if (strArr[i] == 0){
                System.out.println("This is not a pangram");
                t = false;
                break;
            }
        }
        if (t == true){
            System.out.println("This is a pangram");
        }
    }
}

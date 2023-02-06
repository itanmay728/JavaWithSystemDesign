public class Q3 {
    public static void main(String[] args) {
        String str = "2552";
        String st = "";

        for (int i = str.length()-1; i>=0; i--){
            st += str.charAt(i);
        }

        if (str.equals(st)){
            System.out.println("This is a palindrome");
        }else {
            System.out.println("This is not a palindrome");
        }
    }
}

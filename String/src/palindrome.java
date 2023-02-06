public class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String str1 = "";

        for (int i = str.length()-1; i>=0; i--){
            str1 += str.charAt(i);
        }

        if (str.equals(str1)){
            System.out.println("Yes this is a palindrome String");
        }else {
            System.out.println("NO this is not a palindrome String");
        }
    }
}

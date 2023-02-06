public class A2Q3 {
    public static void main(String[] args) {
        String str = "Think Twice";

        String[] sArray = str.split(" ");

        String reverse = "";
        for (String a : sArray){
            for (int i = a.length()-1; i>= 0; i--){
                reverse += a.charAt(i);
            }
            reverse += " ";
        }
        System.out.println(reverse);

    }
}

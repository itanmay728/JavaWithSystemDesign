import java.util.Arrays;
import java.util.Locale;

public class anagram {
    public static void main(String[] args) {
        String str = "School master";
        String str1 = "The class room";

        str = str.replace(" " , "");
        str1 = str1.replace(" ", "");

        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        char[] a1 = str.toCharArray();
        char[] a2 = str1.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.equals(a1,a2)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}

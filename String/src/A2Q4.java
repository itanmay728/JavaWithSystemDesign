import java.util.Arrays;

public class A2Q4 {
    public static void main(String[] args) {
        String st = "qwertyuiopasdfghjklzxcvbnm";
        char[] sArr = st.toCharArray();

        // by using .sort method
        Arrays.sort(sArr);
        System.out.println(sArr);

        //by using for loop
        for (int i = 0 ; i< sArr.length; i++){
            for (int j = i+1; j < sArr.length; j++){
                if (sArr[j] < sArr[i]){
                    char temp = sArr[i];
                    sArr[i] = sArr[j];
                    sArr[j] = temp;
                }
            }
        }

        System.out.println(sArr);
    }
}

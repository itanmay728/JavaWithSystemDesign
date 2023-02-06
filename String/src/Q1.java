public class Q1 {
    public static void main(String[] args) {
        String s1 = "PWSKILLS";
        char[] s2 = s1.toCharArray();
        String s3 = "";
         for (int i = 0; i<s2.length; i++) {
             boolean flag = true;
             for(int j = i+1; j<s2.length; j++) {
                 if (s2[i] == s2[j]) {
                     flag = false;
                     break;
                 }
             }
             if (flag == true){
                 s3+= s2[i];
             }
         }
        System.out.println(s3);
    }
}

public class Q2 {
    public static void main(String[] args) {
        String str  = "PWSKILLS launch a course at affordable price";
        str = str.replace(" " , "");
        str = str.toUpperCase();
        char[] st = str.toCharArray();
        for (int i = 0; i<st.length; i++){
            boolean flag = false;
            for (int j = i+1; j<st.length;j++){
                if (st[i] == st[j]){
                    flag = true;
                }
            }
            if (flag == true){
                System.out.print(st[i]+" ");
            }
        }
    }
}

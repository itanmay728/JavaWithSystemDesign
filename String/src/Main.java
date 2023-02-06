public class Main {
    public static void main(String[] args) {
        // case 1
        String str = "Tanmay";
        String str1 = "";
        int j = str.length()-1;
        while (0<=j){
            str1 += str.charAt(j);
            j--;
        }
        System.out.println(str1);

        //case 2

        String s = "Tanmay kumar";
        String s1 = "";
        String[]  sarr = s.split(" ");
         for (int i = sarr.length-1;i>=0; i--){
             s1 += sarr[i] + " ";
         }
        System.out.println(s1);


        // case 3

        String st = "Tanmay kumar";
        String st1 = "";
        for(int i = st.length()-1; i>=0; i--){
        st1 += st.charAt(i);
        }

        System.out.println(st1);

        // case 4

        String Name = "Tanmay kumar";
        String name1 = "";

        String[] nameArr = Name.split(" ");

        for (String i : nameArr){
            for (int n = i.length()-1; n>=0; n--){
                name1 += i.charAt(n);
            }
            name1 += " ";
        }
        System.out.println(name1);
    }
}
public class Q4 {
    public static void main(String[] args) {
        String str = "Pw Skills @ Tanmay #";
        str = str.toLowerCase();
        char[] st = str.toCharArray();
        int consonants=0, vowels=0, specialCharacters=0;
        for (int i = 0; i<str.length(); i++){
            char ch = st[i];
            if (ch >= 'a' &&  ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }else {
                    consonants++;
                }
            }else{
                specialCharacters++;
            }
        }

        System.out.println("String is = " + str);
        System.out.println("consonants in the string = "+consonants);
        System.out.println("specialCharacters in the string = "+specialCharacters);
        System.out.println("vowels in the string = "+vowels);
    }
}

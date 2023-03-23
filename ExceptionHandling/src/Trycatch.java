public class Trycatch {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;

        int result = 0;


        try
        {
            result = num1 / num2;
        }
        catch (Exception obj)
        {
            System.out.println("something wrong " + obj);
        }

        System.out.println(result);

    }
}

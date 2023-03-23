import java.util.Scanner;

class calculator implements Runnable{
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        int result = num1+num2;
        System.out.println("answer is = " + result);
    }
}

class prints implements Runnable{
    public void run(){
        System.out.println("int print");
    }
}
public class byImplementingRunnable {
    public static void main(String[] args) {

        calculator t1 = new calculator();
        Thread obj1 = new Thread(t1);
        obj1.start();

        print t2 = new print();
        Thread obj2 = new Thread(t2);
        obj2.start();

    }
}

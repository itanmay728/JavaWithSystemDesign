import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

class calc extends Thread{

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        int result = num1*num2;
        System.out.println("answer is = " + result);
    }
}

class print extends Thread{

    public void run(){
        System.out.println("IN print");
    }
}
public class byExtendingThread {
    public static void main(String[] args) {

        calc t = new calc();
        t.start();

        print t1 = new print();
        t1.start();


    }
}

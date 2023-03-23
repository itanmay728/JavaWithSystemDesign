import java.util.Scanner;

class myThread1 implements Runnable{

    public void run(){
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("Calc")) {
            calc1();
        }else {
            print1();
        }

    }
    public void calc1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        int result = num1+num2;
        System.out.println("answer is = " + result);
    }

    public void print1(){
        System.out.println("in print");
    }
}
//class myThread extends Thread{
//    public void run(){
//        String tName = Thread.currentThread().getName();
//        if (tName.equals("Calc")){
//            calc();
//        }else {
//            print();
//        }
//    }
//    public void calc(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter num1");
//        int num1 = sc.nextInt();
//        System.out.println("Enter num2");
//        int num2 = sc.nextInt();
//
//        int result = num1+num2;
//        System.out.println("answer is = " + result);
//    }
//
//    public void print(){
//        System.out.println("in print");
//    }
//}
public class multiTaskBySingleRun {
    public static void main(String[] args) {
//        myThread t1 = new myThread();
//        myThread t2 = new myThread();
//
//        t1.setName("Calc");
//        t2.setName("print");
//
//        t1.start();
//        t2.start();

        myThread1 t3 = new myThread1();
        Thread obj1 = new Thread(t3);
        Thread obj2 = new Thread(t3);

        obj1.setName("Calc");
        obj2.setName("Print");

        obj1.start();
        obj2.start();
    }
}

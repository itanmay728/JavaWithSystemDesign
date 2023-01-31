import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        System.out.println("Printing T");
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < h; j++) {
                if(i == 0) {
                    System.out.print("*");
                }else if(j == h / 2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Printing A");
        int w = (2*h) -1;
        int n = w / 2;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= w; j++) {
                if (j == n || j == (w - n) || (i == h / 2 && j > n && j < (w - n))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            n--;
        }

        System.out.println("Printing N");
        int count = 0;
        for(int i = 0; i < h; i++) {
            System.out.print("*");
            for(int j = 0; j <= h; j++) {
                if(j == h) {
                    System.out.print("*");
                }else if(j == count){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            count = count + 1;
            System.out.println();
        }

        System.out.println("Printing M");
        int count1 = 0;
        for(int i = 0; i < h; i++) {
            System.out.print("*");
            for(int j = 0; j <= h; j++) {
                if(j == h) {
                    System.out.print("*");
                }else if(j == count1 || j == (h - count1 - 1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            if(count1 == h / 2) {
                count1 = -99999;
            }else {
                count1 = count1 + 1;
            }
            System.out.println();
        }

        System.out.println("Printing A");
        int w1 = (2*h) -1;
        int n1 = w1 / 2;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= w1; j++) {
                if (j == n1 || j == (w1 - n1) || (i == h / 2 && j > n1 && j < (w1 - n1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            n1--;
        }

        System.out.println("Printing Y");
        int count2 = 0;
        for(int i = 0; i <= h; i++) {
            for(int j = 0; j < h; j++) {
                if(j == count2 || j == h - count2 && i <= h / 2) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            if(i < h / 2) {
                count2 = count2 + 1;
            }
            System.out.println();
        }
    }
}

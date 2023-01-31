import java.util.Scanner;

public class Q4 {
    public static int absValue(int n) {
        if(n < 0) {
            return (-1 * n);
        }else {
            return n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int h = sc.nextInt();
        for(int i = 0; i < h; i++) {
            System.out.print("*");
            for(int j = 0; j <= h; j++) {
                if((i == 0 || i == h / 2) && j < h - 1) {
                    System.out.print("*");
                }else if(i < h / 2 && j == h - 1 && i != 0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Printing W");


        int count = h / 2;

        for(int i = 0; i < h; i++) {
            System.out.print("*");
            for(int j = 0; j <= h; j++) {
                if(j == h) {
                    System.out.print("*");
                }else if((i >= h / 2) && (j == count || j == h - count - 1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            if(i >= h / 2) {
                count += 1;
            }
            System.out.println();
        }

        System.out.println("Printing S");

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < h; j++) {
                if((i == 0 || i == h / 2 || i == h - 1)) {
                    System.out.print("*");
                }else if(i < h / 2 && j == 0){
                    System.out.print("*");
                }else if(i > h / 2 && j == h - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Printing K");
        int mid = h / 2;
        int temp = mid;

        for(int i = 0; i < h; i++) {
            System.out.print("*");
            for(int j = 0; j <= mid; j++) {
                if(j == absValue(temp)) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            temp = temp - 1;
        }

        System.out.println("Printing I");
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < h; j++) {
                if((i == h - 1) || (i == 0)) {
                    System.out.print("*");
                }else if(j == h / 2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Printing tow L");

        for (int k = 1; k<=2; k++) {
            for (int i = 0; i < h; i++) {
                System.out.print("*");
                for (int j = 0; j <= h; j++) {
                    if (i == h - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        System.out.println("Printing S");

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < h; j++) {
                if((i == 0 || i == h / 2 || i == h - 1)) {
                    System.out.print("*");
                }else if(i < h / 2 && j == 0){
                    System.out.print("*");
                }else if(i > h / 2 && j == h - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

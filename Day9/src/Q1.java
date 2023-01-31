import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height");
        int h = sc.nextInt();

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

        System.out.println("Printing B");

        int mid = (h / 2);
        for(int i = 0; i < h; i++) {
            System.out.print("*");
            for(int j = 0; j < w; j++) {
                if((i == 0 || i == h - 1 || i == mid) && j < (w - 2)) {
                    System.out.print("*");
                } else if (j == (w - 2) && !(i == 0 || i == h - 1 || i == mid)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }

        System.out.println("Printing C");
        for(int i = 0; i < h; i++) {
            System.out.print("*");
            for (int j = 0; j < (h - 1); j++) {
                if (i == 0 || i == h - 1) {
                    System.out.print("*");
                } else {
                    continue;
                }
            }
            System.out.println();
        }

        System.out.println("Printing D");

        for(int i = 0; i < h; i++) {
            System.out.printf("*");
            for (int j = 0; j < h; j++) {
                if((i == 0 || i == h - 1) && j < h - 1) {
                    System.out.printf("*");
                }else if (j == h - 1 && i != 0 && i != h - 1) {
                    System.out.printf("*");
                }else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
        System.out.println("Printing E");
        for (int i = 0; i < h; i++) {
            System.out.printf("*");
            for (int j = 0; j < h; j++) {
                if ((i == h / 2 && j <= h / 2) || (i == 0 || i == h - 1)) {
                    System.out.printf("*");
                } else {
                    continue;
                }
            }
            System.out.printf("\n");
        }

        System.out.println("Printing F");
        for (int i = 0; i < h; i++) {
            System.out.printf("*");
            for (int j = 0; j < h; j++) {
                if ((i == h / 2 && j <= h / 2) || i == 0) {
                    System.out.printf("*");
                } else {
                    continue;
                }
            }
            System.out.printf("\n");
        }

        System.out.println("Printing G");
        w--;
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if((j == 0 || j == w -1 ) && (i == 0 || i == h -1)) {
                    System.out.printf(" ");
                }else if(j == 0) {
                    System.out.printf("*");
                }else if(i == 0 && j <= h) {
                    System.out.printf("*");
                }else if(i == h / 2 && j > h / 2) {
                    System.out.printf("*");
                }else if(i > h / 2 && j == w - 1) {
                    System.out.printf("*");
                }else if(i == h - 1 && j < w) {
                    System.out.printf("*");
                }else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }

        System.out.println("printing H");
        for(int i = 0; i < h; i++) {
            System.out.printf("*");
            for(int j = 0; j < h; j++) {
                if((j == h - 1) || (i == h / 2)) {
                    System.out.printf("*");
                }else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }

    }
}

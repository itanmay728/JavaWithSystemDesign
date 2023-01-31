import java.util.*;
public class Main {

    static void umpire(int guesser, int player1, int player2, int player3, String player1Name,String player2Name,
                       String player3Name ){
        if (guesser == player1){

            if (guesser == player2 && guesser == player3){
                System.out.println("Match tie you all guess correct number");
            }else if (guesser == player2){
                System.out.println(player1Name + " and " + player2Name + " Win");
            }else if (guesser == player3){
                System.out.println(player1Name + " and " + player3Name + " Win");
            }
            System.out.println(player1Name + " win");
        }

        if (guesser == player2) {

            if (guesser == player3) {
                System.out.println(player2Name + " and " + player3Name + " Win");
            }
            System.out.println(player2Name + " win");
        }

        if (guesser == player3){
            System.out.println(player3Name + " win");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random re = new Random();
        int guesser = re.nextInt(25);
        System.out.println(guesser);

        //Player 1
        System.out.println("Player1 Name :- Enter your name");
        String player1Name = sc.next();
        System.out.println( player1Name +" :- Please Enter Your Number");
        int player1 = sc.nextInt();

        //Player 2
        System.out.println("Player2 Name :- Enter your name");
        String player2Name = sc.next();
        System.out.println( player2Name + " :- Please Enter Your Number");
        int player2 = sc.nextInt();

        //Player 3
        System.out.println("Player3 Name :- Enter your name");
        String player3Name = sc.next();
        System.out.println( player3Name + " :- Please Enter Your Number");
        int player3 = sc.nextInt();

        //calling our function or we can say method
        umpire(guesser,player1, player2,player3,player1Name,player2Name,player3Name);
    }
}
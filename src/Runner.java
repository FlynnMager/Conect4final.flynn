import java.util.*;
public class Runner {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Board board=new Board();
        int x=0;
        boolean w;
        while(true){


            System.out.println("Enter A Column:");
            int col= sc.nextInt();
            w= board.move(col);
            if(w){
                System.out.println("You win!");
                break;
            }

            System.out.println("Enter A Column:");
            int col2= sc.nextInt();
            w=board.moveAI(col2);
            if(w){
                System.out.println("AI wins!");
                break;
            }
//(int )(Math.random() * 7)
            if(x>42){
                break;
            }
            x++;
        }


    }
}

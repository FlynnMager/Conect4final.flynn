import java.util.Scanner;

public class Board {
    int[][] board= new int[6][7];
    public Board(){
        for(int row = 5; row > -1; row--) {
            for(int col = 0; col < 7; col++) {

                board[row][col]= 0; //col*10+row;

            }
        }
    }

    public void printBoard() {

        for(int row = 5; row > -1; row--) {
            for(int col = 0; col < 7; col++) {

                System.out.print(board[row][col]+" ");

            }
            System.out.print("\n");
        }


    }
    public boolean move(int x){
        int r=0;
        int y;
        Scanner sc = new Scanner(System.in);
        while(true){
            if(r>5){
                System.out.println("Full Column");
                System.out.println("Enter A Column:");
                 x= sc.nextInt();
                 r=0;
            }else if(board[r][x]==0){
                board[r][x]=1;
                y=r;
                break;
            }else{
                r++;
            }
        }
        this.printBoard();
        return this.checkWin(y,x);
    }

    public boolean moveAI(int x){
        int r=0;
        int y;
        while(true){
            if(r>5){
                System.out.println("Full Column");
            }else if(board[r][x]==0){
                board[r][x]=2;
                y=r;
                break;
            }else{
                r++;
            }
        }

        this.printBoard();
       return this.checkWin(y,x);
    }

    public boolean checkWin(int row, int column){
        int x=0;
        for(int i=0;i<6;i++){
            if(board[row][i]==board[row][i+1]){
                if(board[row][i]!=0){
                    x++;
                }
                if(x==3){
                    return true;
                }
            }else{
                x=0;
            }
        }
        for(int i=0;i<5;i++){
            if(board[i][column]==board[i+1][column]){
                if(board[i][column]!=0){
                    x++;
                }
                if(x==3){
                    return true;
                }
            }else{
                x=0;
            }
        }

        return false;
    }

}


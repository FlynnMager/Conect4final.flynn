public class Player {
    int token;
    Board board=new Board();
    public Player(int token){
        this.token=token;
    }



    public void setBoard(Board board) {
        this.board = board;
    }
}

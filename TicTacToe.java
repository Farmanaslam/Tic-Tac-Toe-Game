import java.util.Scanner;

class TicTacToe{
  //Printing board fuunction
  public  static void printBoard(char[][] board) {
    for(int row=0;row<board.length;row++){
      for(int col=0;col<board[row].length;col++){
          System.out.print(board[row][col]+" | ");
      }
      System.out.println();
  }
 
  }
  //Winning check function
  public  static boolean haveWon(char [][] board,char player){
    //Checking for rows..........
      for(int row=0;row<board.length;row++){
        if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
          return true;
        }
      }
      //checking for coloumns..........
      for(int col=0;col<board[0].length;col++){
        if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
          return true;
        }
      }
      //checking for diagonals.........
     if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
         return true;
     }
     if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
      return true;
     }
     return false;
  }
    
    public static void main(String[] args) {
      System.out.println("Welcome to Tic Tac Toe ");
      System.out.println("Use row,col for input values..\n");
        //Creating board for game
        char board[][]=new char[3][3];
        //Initialising row and coloumn with empty value
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                board[row][col]=' ';
            }
        }
        Scanner sc=new Scanner(System.in);

        //Player X
      char player='X';
      boolean over=false;
      while(!over){
        printBoard(board);
        System.out.println("Player "+player+" Enter:");
      int row=sc.nextInt();
      int col=sc.nextInt();
      System.out.println();
      if(board[row][col]==' '){
        //Put the element
        board[row][col]=player;
        over=haveWon(board,player);
        if(over){
            System.out.println("Player "+player+" has won...");
        }else{
            if(player=='X'){
                player='O';
            }else{
                player='X';
            }
        }
      }else{
        System.out.println("Invalid Move . Try Again!");
      }
      }
      printBoard(board);
    }
}
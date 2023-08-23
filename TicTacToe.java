
import java.util.*;
class TicTacToe
{
   static char[][] board;
    public TicTacToe()
    {
      board = new char[3][3];
      initBoard();
    }
    public void initBoard()
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                board[i][j]= ' ';
            }
        }
    }

    static void dispBoard()
    {
        System.out.println("----------------");
        for(int i=0;i<board.length; i++)
        {
            System.out.print("|  ");
            for(int j=0;j<board[i].length; j++)
            {
            System.out.print(board[i][j]+" |  ");
    }
    System.out.println();
    System.out.println("----------------");
}
}

static void placeMark(int row , int col, char mark)
{
    if(row>=0 && row<=2 && col>=0 && col<=2)
    {
    board[row][col] =mark;
    }
    else 
    {
        System.out.println("invalid position");
    }
}

static Boolean checkColWin()
{
    for(int j=0;j<=2; j++)
    {
   if(board[0][j]!=' ' && board[0][j]==board[1][j] && board[1][j]==board[2][j])
   {
     return true;
   }
}
return false;
}

static Boolean checkRowWin()
{
    for(int i=0;i<=2; i++)
    {
   if( board[i][0]!=' '&& board[i][0]==board[i][1] && board[i][1]==board[i][2])
   {
     return true;
   }
}
return false;
}

static Boolean checkDiagWin()
{   
   if(  board[0][0] !=' '&& board[0][0]==board[1][1] && board[1][1]==board[2][2] || board[0][2]!=' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0] )
   {
  return true;
   }
   else {
return false;
}
}
static Boolean checkToDraw()
{
    for(int i=0; i<=2; i++)
    {
        for(int j=0; j<=2; j++)
        {
            if(board[i][j] == ' ')
            {
                return false;
            }
        }
    }
    return true;
}
}

class HumanPlayer
{
   String name;
   char mark;
    HumanPlayer(String name, char mark)
   {
     this.name = name;
     this.mark = mark;
    }

   void makeMove()
   {
    int row;
    int col;
    Scanner scan=new Scanner(System.in);
    do {
        System.out.println("Enter the row and col");
     row=scan.nextInt();
     col=scan.nextInt();

    } while (!isValidMove(row,col));
    TicTacToe.placeMark(row,col,mark);
   }

   boolean isValidMove(int row, int col)
   {
    if( row>=0 && row<=2 && col>=0 && col<=2)
    {
    if(TicTacToe.board[row][col]==' ')
    {
        return true;
    }
    }
    return false;
   }
}

class MiniProject
{
    public static void main(String args[])
    {
        System.out.println("Welcome to TicTocToe Games created by MD ASHRAF");
        TicTacToe  t=new TicTacToe();
        TicTacToe.dispBoard();
        HumanPlayer p1=new HumanPlayer("Player 1",'X');
        HumanPlayer p2=new HumanPlayer("Player 2",'O');
        HumanPlayer cp;
           cp =p1;
           while(true)
           {
            System.out.println(cp.name + " Turn ");
          cp.makeMove();
          TicTacToe.dispBoard();
           if(TicTacToe.checkColWin()|| TicTacToe.checkRowWin()|| TicTacToe.checkDiagWin())
           {
             System.out.println("Congratulations.. " + cp.name + " You won the Game");
             break;
           }
           else if(TicTacToe.checkToDraw())
           {
            System.out.println("Match is Draw");
            break;
           }
            else 
            {
                if(cp==p1)
                {
                    cp=p2;
                }
                else
                {
                 cp=p1;
                }
            }
           }
    }
}

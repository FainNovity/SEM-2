/*
reduced representation of "game of life" code:
basically, it starts with a non-zero position value on Matrix board.
some rules are set by which, the board changes every second.
as a result, number of non-zero digits on board either increases or decreases.

in this, following rules are used :
1) any cell with less than 2 alive cells around is dead.
2) any cell having 2 or 3 alive cells around stays alive.
3) any cell having more than 3 alive cells around, dies.

following this rule, Matrix starts with a random input and either goes into endless chain of life or sequance of life to death.

*/
import java.util.*;
public class Life {
	public static void main(String[] args) {
	int[][] board= new int[10][10];
	int sec=0;
	  for(int i=0;i<board.length;i++){
	  	for(int j=0;j<board[0].length; j++){
	  		board[i][j]= (int)Math.round(Math.random());
	  		}
	  	}
	  while(!Solution.dead(board)){
	  	System.out.print("\033[H\033[2J"); 
	  	System.out.flush();
	  	Solution.gameOfLife(board);
	  	printArr(board);
	  	try {
	  	Thread.sleep(1000);
	  	}
	  	catch(Exception e){
	  		e.printStackTrace();
	  		}
	  		sec++;
	  	}
	  	System.out.print("Alive for " +sec+" seconds!!"); 
	}
	public static void printArr(int[][] board){
		for(int i=0;i<board.length;i++){
	  	for(int j=0;j<board[0].length; j++){
	  		if(board[i][j]==1){
	  			System.out.print("◈"); 
	  			}
	  	    else {
	  	        System.out.print("  ");	
	  	    	}
	  		System.out.print("  ");
	  		}
	  		System.out.println(""); 
	  	}
		}
}
class Solution {
    public static void gameOfLife(int[][] board) {
       boolean[][] life= new boolean[board.length][board[0].length];
       
       for(int i=0;i<board.length;i++){
           for(int j=0;j<board[0].length;j++){
             life[i][j] = alive(board[i][j],state(board,i,j));
           }
       }
       for(int i=0;i<board.length;i++){
           for(int j=0;j<board[0].length;j++){
         if(board[i][j]==1 && life[i][j]==false)
             board[i][j]=0;
           
         if(board[i][j]==0 && life[i][j]==true)
             board[i][j]=1;
           
       }
    }
     }
    
    private static int state(int[][] board, int m, int n){
       int alive=0;
       
      for(int i=m-1;i<board.length && i<=m+1;i++){
     if(i>=0){  
      for(int j=n-1;j<board[i].length && j<=n+1;j++){
        if(i>=0 && j>=0 && (i!=m || j!=n)){
        if(board[i][j]==1){
            alive++;
        }
            
        }    
        }
          }
      } 
        return alive;
    }
    
    private static boolean alive(int val,int state){
       if(state<2)
           return false;
       if(val==1 && state<=3)
           return true;
       if(val==0 && state==3)
           return true;
       else
           return false;
        
       
    }
    public static boolean dead(int[][] board){
    	for(int i=0;i<board.length;i++){
	  	for(int j=0;j<board[0].length; j++){
	  	  if(board[i][j]==1)
	  	  return false;
	  	  }
	  	}
		return true;
    	}
}
import java.math.BigInteger;

public class Chess {
	public static void main(String[] args) {
		System.out.println(-4 & 1);
	char [][]board= new char[8][8];
	char white[]={'R','K','B','C','Q','B','K','R'};
	for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(i==7){
					board[i][j]=white[j];
					}
				else if(i==6){
					board[i][j]='P';
					}
				else if(i==1){
					board[i][j]='p';
					}
				else if(i==0){
					board[i][j]=(char)(white[j]+32);
					}	
				else {
					board[i][j]=' ';
					}
			}
		}
	update(board);
	}
	
	static void update(char [][]board){
		
		for(int i=0;i<17;i++){
			for(int j=0;j<17;j++){
				if(i%2==0){
					System.out.print("__"); 
					}
				else if(j%2==0){
					if(i<16 && j<16 && board[i/2][j/2]!=' '){
					System.out.print(" | ");
						} 
					else if(i<16 &&j<16 && board[i/2][j/2]==' '){
					System.out.print(" | ");
						}
					}
				else {
					System.out.print(board[i/2][j/2]);
					/* if(board[i/2][j/2]=='P'){
					System.out.print("♙");	
						}
					else if(board[i/2][j/2]=='p'){
					System.out.print("♟︎");	
						}
					else if(board[i/2][j/2]=='R'){
					System.out.print("♖");	
						}
					else if(board[i/2][j/2]=='r'){
					System.out.print("♜");	
						}
					else if(board[i/2][j/2]=='K'){
					System.out.print("♘");	
						}
					else if(board[i/2][j/2]=='k'){
					System.out.print("♞");	
						}
					else if(board[i/2][j/2]=='B'){
					System.out.print("♗");	
						}
					else if(board[i/2][j/2]=='b'){
					System.out.print("♝");	
						}
					else if(board[i/2][j/2]=='C'){
					System.out.print("♔");	
						}
					else if(board[i/2][j/2]=='c'){
					System.out.print("♚");	
						}
					else if(board[i/2][j/2]=='Q'){
					System.out.print("♕");	
						}
					else if(board[i/2][j/2]=='q'){
					System.out.print("♛");	
						} */
						
					}
				}
				System.out.println(""); 
			}
	}
	
	void isCheck(char [][]board,char c){
	for(int i=0;i<board.length;i++){
		for(int j=0;j<board[i].length;j++){
		
			}
		}	
		}
}
abstract class Piece {
	int cordX;
	int cordY;
	char side;
	abstract boolean validMove(int[] next);
	public Piece(){

	}
	public Piece(int cordX,int cordY,char side){
	this.cordX= cordX;
	this.cordY= cordY;
	this.side= side;	
	}
}
class King extends Piece {
	boolean castleLow= true;
	boolean castleHigh= true;
	King(char side){
	super.side= side;
		if(side=='w'){
			super.cordX = 5;
			super.cordY = 1;
		}
		if(side=='b'){
			super.cordX = 5;
			super.cordY = 8;
		}
	}
	boolean validMove(int[] next){
		if(check(next)){
			if(Math.abs(cordX-next[0])<=1 && Math.abs(cordY-next[1])<=1 && !(cordX==next[0] && cprdY==next[1])){
				cordX = next[0];
				cordY = next[1];
			}
			else if(castle(int[] next)){
				cordX = next[0];
				cordY = next[1];
			}
		}
	}
	boolean check(int[] next){

	}
	boolean castle(int[] next){

	}
	boolean checkmate(){

	}
	boolean stalemate(){
		
	}
}
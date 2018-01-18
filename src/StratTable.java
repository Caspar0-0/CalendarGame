
public class StratTable {
	private int[][] gamesData = new int [365][2];
	public StratTable() {
		for(int i=0;i<365;i++){
			for(int j=0;j<2;j++){
			gamesData[i][j]=1;
		}
			
	}
		gamesData[364][0]=0;
}
	public void update(Date[] userDate,int numMoves, int win){
		
	}
	public String likelyMove(Date[] legalMoves){
		return null;
		
	}
	public String bestMove(Date[] bestMoves){
		return null;
		
	}
}

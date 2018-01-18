
public class TestBench {
	public static void main(String[] args) {
		Date pattyDay = new Date("Mar",15);
		Date [] potentialMoves = pattyDay.legalMoves();
		//System.out.println(pattyDay.legalMoves());
//		for (int i=0;i< potentialMoves.length;i++){
//			System.out.print(potentialMoves[i]+", ");
		System.out.print(Date.dayNum(pattyDay));
			
	//}
	}

}

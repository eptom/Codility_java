
public class FrogJump {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		solution(10,101,30);
		
	}
	
	public static int solution(int X, int Y, int D) {
		// write your code in Java SE 8
		int jumps = 0;
//		while(X<Y){
//			X = X + D;
//			jumps++;
//		}


		int dis = Y-X;
		if(dis%D == 0){
			jumps = dis/D;
		}else{
			jumps = dis/D + 1;
		}
		System.out.println(jumps);
		
		
		return jumps;
	}

}

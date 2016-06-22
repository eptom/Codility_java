
public class CountDiv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = solution(6,11,2);
		System.out.println(k);
	}
	
	public static int solution(int A, int B, int K){
		int nr = 0;
		for(int i=A ;i<B+1; i++){
			if(i%K==0){
				nr++;
				// i+=K-1;
				// wziac i - odjac i od B i podzielic przez K
				nr = nr + (B-i)/K;
				System.out.println(nr);
				return nr;
			}
		}
		return nr;
	}

}

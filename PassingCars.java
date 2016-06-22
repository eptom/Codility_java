import java.util.*;


public class PassingCars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,0};
		int wynik = solution(A);
		System.out.println(wynik);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int pairs = 0;
		int q = 0;
		int op_q = 1;

		if(A[0]==1){
			q = 1;
			op_q = 0;
		}
		
		for(int i=0;i<A.length;i++){
			if(A[i]==q){
				for(int j=i;j<A.length;j++){
					if(A[j]==op_q){
						pairs++;
						if(pairs>1000000000){
							return -1;
						}
					}
				}
			}
		}

		return pairs;
	}

}

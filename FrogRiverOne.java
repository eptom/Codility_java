import java.util.ArrayList;
import java.util.Collections;


public class FrogRiverOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = {1,3,1,4,2,3,4,3,2};
		int wynik = solution(5,A);
		System.out.println(wynik);
	}

	public static int solution(int X, int[] A) {
		// write your code in Java SE 8
		
		int temp = -1;
		for(int i=0;i<A.length;i++){
			if(A[i]==X){
				return i;
			}
		}
		
		System.out.println(temp);

		return temp;
	}

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


public class MissingInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {-11,3,12,1,213};
		int wynik = solution(A);
		System.out.println(wynik);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8

		int missing = 1;
		HashSet<Integer> hash = new HashSet<Integer>();
		for(int i=0;i<A.length;i++){
			hash.add(A[i]);
			while(hash.contains(missing)){
				missing++;
			}
		}
		System.out.println(hash.toString());
		
		return missing;
	}


}

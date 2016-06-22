import java.util.*;

public class MinAvgTwoSlice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,4,4,6,1,4,4};
		System.out.println(solution(A));
		
		int[] B = {-3, -5, -8, -4, -10};
		System.out.println(solution(B));
		
		int[] C = {4, 2, 2, 5, 1, 5, 8};
		System.out.println(solution(C));
		//System.out.println(wynik);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		ArrayList<Double> avg_2 = new ArrayList<Double>();
		ArrayList<Double> avg_3 = new ArrayList<Double>();
		for(int i=0;i<A.length-1;i++){
			avg_2.add((double) ((A[i]+A[i+1])/2.0));
		}
		
		double min_2 = Collections.min(avg_2);		
		int pos_2 = avg_2.indexOf(min_2);
		
		if(A.length>2){
			for(int i=0;i<A.length-2;i++){
				avg_3.add((double) ((A[i]+A[i+1]+A[i+2])/3.0));
			}
			double min_3 = Collections.min(avg_3);
			int pos_3 = avg_3.indexOf(min_3);
			if(min_3<min_2){
				return pos_3;
			}
		}	
		
		
		return pos_2;
	}

}

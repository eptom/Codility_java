import java.util.*;

public class TapeEqu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 3,1,2,4,3};
		int wynik = solution(A);
		System.out.println(wynik);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		ArrayList<Integer> dist_up = new ArrayList<Integer>();
		ArrayList<Integer> dist_down = new ArrayList<Integer>();
		ArrayList<Integer> dist = new ArrayList<Integer>();
		
		int length = A.length;
		int tmp1 = 0;
		int tmp2 = 0;
		
		for(int i=0;i<length-1;i++){
			tmp1 = tmp1 + A[i];
			dist_up.add(tmp1);
			
			tmp2 = tmp2 + A[length-i-1];
			dist_down.add(tmp2);
		}
		
		int size = dist_up.size();
		for(int i=0;i<size;i++){
			dist.add(Math.abs(dist_up.get(i)-dist_down.get(size-i-1)));
			
		}
		
		System.out.println(dist_up.toString());
		System.out.println(dist_down.toString());
		System.out.println(dist.toString());

		return Collections.min(dist);
	}
}

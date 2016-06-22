import java.util.*;


public class MaxCounters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,4,4,6,1,4,4};
		int[] wynik = solution(5,A);
		//System.out.println(wynik);
	}

	public static int[] solution(int N, int[] A) {
		// write your code in Java SE 8
		int[] array = new int[N];
		int n = A.length;
		int value = 0;
		int max = 0;
		
		for(int i=0;i<n;i++){
			int which = A[i];
			value=0;
			if(which>=1 && which<=N){
				value = array[which-1];
				array[which-1] = value+1;
				if(max<(value+1)){
					max = value+1;
				}
			}else if(which == N+1){
				Arrays.fill(array,max);
			}
		}
		
		for(int i=0;i<N;i++){
			//array[i]=temp.get(i);
			System.out.print(array[i]);
		}

		//System.out.println(temp);
		
		return array;
	}
}

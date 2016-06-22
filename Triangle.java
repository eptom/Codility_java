import java.util.*;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {10,2,5,1,8,20};
		solution(A);
	}
	
	public static int solution(int[] A){
		int triangles = 0;
		// 3 petle for
//        A[P] + A[Q] > A[R],
//        A[Q] + A[R] > A[P],
//        A[R] + A[P] > A[Q].

		for(int i=0;i<A.length;i++){
			for(int j=0;j<A.length;j++){
				for(int k=0;k<A.length;k++){
					
				}
			}
		}
		
		return triangles;
	}

}

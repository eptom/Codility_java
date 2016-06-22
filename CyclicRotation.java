import java.util.ArrayList;


public class CyclicRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4,6,1,3,5,7,3,2,1,3,5,6};
		solution(A,2);
		
	}
	
	public static int[] solution(int[] A, int K) {
		ArrayList<Integer> arrayTemp = new ArrayList<Integer>();

        
		int size = A.length;

		int[] array = new int[size];
		
		for(int i=0;i<size;i++){
			arrayTemp.add(A[i]);
		}
		
		for(int i=0;i<size;i++){
			int newPos = (i+K)%size;
			arrayTemp.set(newPos, A[i]);
		}
		
		for(int i=0;i<size;i++){
			array[i] = arrayTemp.get(i);
			System.out.println(array[i]);
		}
		
		System.out.println(arrayTemp);
		
		
		return array;
    }

}

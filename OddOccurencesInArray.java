
public class OddOccurencesInArray {

	public static void main(String[] args){
		int[] array = {1,1,2,3,2,3,4,6,4};
		System.out.println(solution(array));

	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		
		int result = 0;
		for(int i:A){
			result = result^i;
		}
		return result;
	}
}

import java.util.*;

public class PermCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3,4,2};
		int wynik = solution(A);
		System.out.println(wynik);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int perm = 0;
		if(A.length>0){
			if(A.length==1 && A[0]==1){
				return 1;
			}else{
				for(int i=0;i<A.length;i++){
					temp.add(A[i]);
				}
				Collections.sort(temp);
				if(temp.get(0)==1){
					for(int i=0;i<A.length-1;i++){
						if(temp.get(i+1)-temp.get(i)==1){
							perm = 1;
						}else{
							return 0;
						}
					}
				}else{
					return 0;
				}
			}
		}else{
			return perm;
		}
		return perm;
	}
}

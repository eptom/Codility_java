import java.util.*;
public class GenomicRangeQuery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] P = {0,0,1};
		int[] Q = {0,1,1};
		int[] k = solution("TC",P,Q);
		System.out.println(k);
	}

	public static int[] solution(String S, int[] P, int[] Q){
		int P_size = P.length;
		int S_size = S.length();
		int[] factor = new int[P_size];
		ArrayList<Integer> temp = new ArrayList<Integer>();

		HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
		HashMap<Integer,Character> hashI = new HashMap<Integer,Character>();

		for(int i=0;i<S_size;i++){
			Character c = S.charAt(i);
			if(c.equals('A')){
				hash.put('A', 1);
				hashI.put(1,'A');
			}else if(c.equals('C')){
				hash.put('C', 2);
				hashI.put(2,'C');
			}else if(c.equals('G')){
				hash.put('G', 3);
				hashI.put(3,'G');
			}else if(c.equals('T')){
				hash.put('T', 4);
				hashI.put(4,'T');
			}
		}
		
		System.out.println(hash.toString());
		
		for(int i=0;i<P_size;i++){
			int a_pos = P[i];
			int b_pos = Q[i];
			if(a_pos < S_size && b_pos < S_size){
				if(a_pos==b_pos){
					Character str1 = S.charAt(a_pos);
					temp.add(hash.get(str1));
					System.out.println("a_pos == b_pos :" + str1);
				}else if(a_pos<b_pos){
					CharSequence str2 = S.subSequence(a_pos, b_pos+1);
					System.out.println("a_pos - b_pos :" + str2);
					for(int j=0;j<4;j++){
						Character s = hashI.get(j+1);
						if(s!= null && str2.toString().contains(s.toString())){
							temp.add(j+1);
							break;
						}
					}
				}else if(b_pos<a_pos){
					CharSequence str2 = S.subSequence(b_pos, a_pos+1);
					System.out.println("b_pos - a_pos :" + str2);
					for(int j=0;j<4;j++){
						Character s = hashI.get(j+1);
						if(s!= null && str2.toString().contains(s.toString())){
							temp.add(j+1);
							break;
						}
					}
				}
			}
		}

		for(int i=0;i<temp.size();i++){
			factor[i]=temp.get(i);
		}
		System.out.println(temp);
		return factor;
	}

}

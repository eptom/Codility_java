import java.util.ArrayList;


public class BinaryGap {
	
	public static void main(String[] args){
		int n = solution(5);
		n = solution(2);
		n = solution(4);
		n = solution(51712);
		n = solution(20);
	}
	
	public static int solution(int N) {
        ArrayList<Integer> bin = new ArrayList<Integer>();
        ArrayList<Integer> max = new ArrayList<Integer>();
        if(N==1){
            return 0;
        }else{
        	bin = intToBin(N);
        	int counter = 0;
        	boolean jedynka = false;
        	
        	for(int i = 0;i<bin.size();i++){
       			if(bin.get(i)==0 && jedynka){
       				counter++;
       			}else{
       				max.add(counter);
       				counter = 0;
       			}
       			if(bin.get(i)==1){
       				jedynka = true;
       	   		}
        	}
        	int maxN = findMax(max);
        	System.out.println(bin.toString());
        	System.out.println(maxN);
        }
		return N;
        
    }
    
    public static ArrayList<Integer> intToBin(int N){
    ArrayList<Integer> binary = new ArrayList<Integer>();
    
	    while(N!=0){
	        binary.add(N%2);
	        N = N/2;
	    }
    
	    return binary;
    }
    
    public static int findMax(ArrayList<Integer> max){
        int maxN=0;
    	for(int i=0;i<max.size();i++){
    		if(maxN<max.get(i)){
    			maxN=max.get(i);
    		}
    	}
		return maxN;
     }
}

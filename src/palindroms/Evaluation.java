package palindroms;

public class Evaluation {

	static boolean isPalindrom(String s){
		char[] sample = s.toCharArray();
		int n =0;
		int m = sample.length;
		while(m>n){
				if(sample[m-1]==sample[n]){
				m--;
				n++;
				return true;
			}
			else break;
			
		}
		return false;
		
		
			
		
	}

	
}

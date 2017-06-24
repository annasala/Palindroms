package palindroms;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		String sample = "werty";
		String path = "E:/palindromInput.txt";
		List<String> palindroms = new ArrayList<String>();

		for (String s : InputHandling.readInput(path) ){
			if (Evaluation.isPalindrom(s)==true){
				palindroms.add(s);
			}
			
		}
		InputHandling.writeToFile(palindroms);
	
	}

}

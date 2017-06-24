package palindroms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class InputHandling {
	
	static List<String> readInput(String filename){
		
		List<String> listOfWords = new ArrayList<String>();
			

			try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

				String sCurrentLine;

				while ((sCurrentLine = br.readLine()) != null) {
					//System.out.println(sCurrentLine);
					listOfWords.add(sCurrentLine);
				}

			} catch (IOException e) {
				e.printStackTrace();
	
		}
		
			return listOfWords;
}
	
	static void writeToFile(List<String> palindroms){
		
		final String filename = "E:/palindromsOutput.txt";
		
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			
			fw = new FileWriter(filename);
			bw = new BufferedWriter(fw);
			for (String s: palindroms){
				
				bw.write(s +"\n" );
				
			}
		
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		
		
		
	}
}

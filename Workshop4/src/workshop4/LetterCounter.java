package workshop4;

import java.io.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

@SuppressWarnings("unused")
public class LetterCounter {
	
	private static TreeMap<Character, Integer> tmap = new TreeMap<Character, Integer>();
	private static ArrayList<Character> fileContent=new ArrayList<Character>();
	
	public static String readFile(String fileName) {
		
		
		int letter=0;

		File file = new File ("./src/workshop4/" + fileName);
		
		try {
			
			FileReader filereader=new FileReader(file);

			
			while((letter=filereader.read())>0 ) {		
				
			if(letter>=65 && letter <=122){
		
			fileContent.add((char)letter);
			
			}
			
//			} else if ((letter >=97 && letter <=122)) { 
//				
//			letter-=32;
//			
//			fileContent.add(letter);
//			
//			}

			
			}
			
			filereader.close();
			
			} catch (FileNotFoundException e) {
			
				return "1";

			} catch (IOException e) {
				
				return "2";
				
			}
		
		for(Character b : fileContent) {
			
		    if(tmap.containsKey(b)){
		        tmap.put(b,tmap.get(b)+1);
		    }else{
		        tmap.put(b, 1);
		    }

		}
		
	
		Set<Character> keys = tmap.keySet();
		
		String ret="";

		 for(Character key: keys){
	      ret += "Number of "+ key+ "'s: " + tmap.get(key)+ "\n";
	      }
		 
//		 keys.clear();
//		
//		 tmap.clear();
		 
		return ret;
	
}
	
}
	

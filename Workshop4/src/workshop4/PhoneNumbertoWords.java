package workshop4;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Iterator;

public class PhoneNumbertoWords {
	
	public static void phoneNumber(String phoneNum) {
	
	TreeMap<Character, char[]> tmapPN = new TreeMap<Character, char[]>();
//	ArrayList<Character> PhoneNumArr=new ArrayList<Character>();
//	ArrayList<String> Words=new ArrayList<String>();

	
		tmapPN.put('2',new char[] {'A','B','C'});
		tmapPN.put('3',new char[] {'D','E','F'});
		tmapPN.put('4',new char[] {'G','H','I'});
		tmapPN.put('5',new char[] {'J','K','L'});
		tmapPN.put('6',new char[] {'M','N','O'});
		tmapPN.put('7',new char[] {'P','R','S'});
		tmapPN.put('8',new char[] {'T','U','V'});
		tmapPN.put('9',new char[] {'W','X','Y'});
		
		List<String> word = new ArrayList<>();
	 
	    word.add("");
	    

	    for (int i = 0; i < phoneNum.length(); i++) {
	    	
	    	if(i!=3) {
	    
	        ArrayList<String> temp = new ArrayList<>();
	        
	        char[] contents = tmapPN.get(phoneNum.charAt(i));
	        
	    	
	        //word.size() is 1
	        
	        for (int j = 0; j < word.size(); j++) { 
	            for (int p = 0; p < contents.length; p++) { //add contents to word[i]
	                temp.add(new StringBuilder(word.get(j)).append(contents[p]).toString()); //create new String 
	            }
	        }
	        
	        word.clear();
	        word.addAll(temp);
	        
	       
	    	}
	    }
	    
	    System.out.println(word);
	    System.out.println("\n" + word.size());

    
	    
}
}		





//
//List<String> word = new ArrayList<>();
//if (phoneNum.length() == 0) {
//word.add("");
//}

/*Sources:https://www.programcreek.com/2014/04/leetcode-letter-combinations-of-a-phone-number-java/*/

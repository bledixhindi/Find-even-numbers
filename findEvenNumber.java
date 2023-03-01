package data;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class findEvenNumber {
	
 public static List<Integer> findEven(List<Integer> list){
		 
		 List<Integer> evenList = new LinkedList<>();
		 for (Integer el : list) {
			if(el % 2 == 0) {
				evenList.add(el);
				
			}
			
		}
		 
		 return evenList;
		 
		 
	 }

	 public static void main(String[] args) {
		
		 Integer[] nr = {1 , 2 , 3, 4 ,5};
		 List<Integer> myNr= Arrays.asList(nr);

		 List<Integer> uniqueList = findEven(myNr);
		 System.out.println(uniqueList);
	}
	 
	

	
	

}

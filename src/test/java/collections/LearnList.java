package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
	//	ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();
		
	//	ArrayList<String> list = new ArrayList<>();
		
		list.add("Ganga");
		list.add("Arun");
		list.add("Veera");
		list.add("Nithi");
		list.add("Ganga");
		list.add(1, "Radha");
		list.set(1, "Ganga");
		list.remove("Ganga");
		int size = list.size();
		String string;
		
//		Collections.sort(list);
//		
//		for(String eachValue:list) {
//			System.out.println(eachValue);
//		}
		
		
//		
//		boolean contains = list.contains("Ganga");
//		System.out.println(contains);
		
		
 	for (int i = 0; i < size; i++) {
			string = list.get(i);
			System.out.println(string);
		}
		
		
	}

}

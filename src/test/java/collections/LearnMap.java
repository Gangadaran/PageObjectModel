package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {
	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<>();
//		map.put(44, "Gangadaran");
//		map.put(45, "Arun");
//		map.put(47, "Nithi");
//		map.put(46, "Bhrath");
//		map.put(44, "Radha");
//		map.put(33, "Vineeth"); 

//		boolean containsKey = map.containsKey(44);
//		System.out.println(containsKey);
//		boolean containsValue = map.containsValue("Gangadaran");
//		System.out.println(containsValue);
		
	
//		
//	   Set<Entry<Integer,String>> entrySet = map.entrySet();
//	   System.out.println(entrySet);
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Ganga");
		list.add("Ganga");
		list.add("Arun");
		
		Set<String> set = new LinkedHashSet<>(list);
		
		for (String eachValue : set) {
		System.out.println(eachValue);	
		}
		
	   
		
//		
//		     Set<Entry<Integer,String>> entrySet = map.entrySet();
//        for (Entry<Integer, String> eachentry : entrySet) {
//			System.out.println(eachentry.getKey()+"->"+eachentry.getValue());
//		}
		
		
		//		Set<Integer> keySet = map.keySet();
//		for (Integer eachValue : keySet) {
//			System.out.println(eachValue +"->"+map.get(eachValue));
//		}
		
//String string = map.get(44);	
//System.out.println(string);
}

}

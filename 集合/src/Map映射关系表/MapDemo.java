package Map映射关系表;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,Double> map=new HashMap<>();
		map.put("语文", 90.0);
		map.put("英语", 80.0);
		map.put("数学", 70.0);
		System.out.println(map.put("语文", 80.0));
		System.out.println(map);
		
		System.out.println(map.get("语文"));
		
		System.out.println(map.containsKey("语文"));
		
		
		//遍历
		for(Object s:map.keySet()){
			System.out.println(s+"--------->"+map.get(s));
		}
		
		System.out.println("---------------");
		
		for(Entry<String,Double> entry:map.entrySet()){
			System.out.println(entry);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//keySet()
//		for(Object key:map.keySet()){
//			System.out.println(key+"--->"+map.get(key));
//		}
//		//entrySet()
//		for (Entry<String, Double> entry : map.entrySet()) {
//			String key=entry.getKey();
//			Double val=entry.getValue();
//			System.out.println(key+"-"+val);
//		}
	}
}

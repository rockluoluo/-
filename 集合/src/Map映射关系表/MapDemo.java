package Mapӳ���ϵ��;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,Double> map=new HashMap<>();
		map.put("����", 90.0);
		map.put("Ӣ��", 80.0);
		map.put("��ѧ", 70.0);
		System.out.println(map.put("����", 80.0));
		System.out.println(map);
		
		System.out.println(map.get("����"));
		
		System.out.println(map.containsKey("����"));
		
		
		//����
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

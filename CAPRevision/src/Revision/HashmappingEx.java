package Revision;

import java.util.HashMap;

public class HashmappingEx {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("obj1", null);
		map.put("obj2", null);
		map.put(null, null);
		map.put("obj3", "obj3");
		System.out.println(map.size());
	}

}

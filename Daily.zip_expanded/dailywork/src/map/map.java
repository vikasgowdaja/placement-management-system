package map;

import java.util.HashMap;

public class map {

	public static void main(String[] args) {
		
		String s="this is anand";
		HashMap<String,Integer>h=new HashMap<>();
		String[] str=s.split("");
		for(String s1:str)
		{
			if(h.get(s1)!=null)
			{
				h.put(s1,h.get(s1)+1);
			}
		else
		{
			h.put(s1,1);
		}
		}
		System.out.println(h);
	}
}

package Revision;

public class ValuedependsonUpdation {public static void main(String[] args) {
	
	//reference value   
	String str =new String("PACE");
	System.out.println("Length of the string is:"+str.length());
	
	
	String str1=str;
	
	
	// str value got updated
	str=null;
	System.out.println("Length of the string is:"+str1.length());
}

}

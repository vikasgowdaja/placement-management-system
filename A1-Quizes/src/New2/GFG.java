// Java program to count the number
// of occurrence of a word in
// the given string
import java.io.*;

class GFG {

static String countOccurrences(String str)
{
	// split the string by spaces in a
	String a[] = str.split(" ");

	// search for pattern in a
	int count = 0;
	for (int i = 0; i < a.length; i++)
	{
	// if match found increase count
	if (word.equals(a[i]))
		count++;
	}

	return str;
}

// Driver code
public static void main(String args[])
{
	String str = "GeeksforGeeks A computer science portal for geeks ";
	String word = "portal";
	System.out.println(countOccurrences(str, word));
}
}

/*This code is contributed by Nikita Tiwari.*/

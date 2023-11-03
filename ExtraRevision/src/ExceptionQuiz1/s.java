package ExceptionQuiz1;

public class s {
public static void main(String[] args) {
	try
	{
	int x = 0;
	int y = 5 / x;
	}
	catch (NullPointerException ae)
	{
	System.out.println(" Arithmetic Exception");
	}
	System.out.println("finished");
	catch (Exception e)
	{
	System.out.println("Exception");
	}

}
}

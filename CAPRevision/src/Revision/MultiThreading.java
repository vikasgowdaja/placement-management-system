package Revision;

public class MultiThreading  {public static void main(String[] args) {
	
	for(int i=0;i<=3;i++){
	MultiThreadThing myThing = new MultiThreadThing();
	MultiThreadThing myThing2 = new MultiThreadThing();
	
	myThing.start();
	myThing2.start();
	}

}
}

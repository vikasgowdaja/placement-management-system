package day2;

public class DiaPat {
public static void main(String[] args) {
	int  rows = 4;
	int spaces=rows-1;
	int stars=1;
	for(int i=1; i<=rows;i++) {
		for (int j=1;j<=spaces;j++) {
			System.out.print(" ");
		}
		for (int j=1;j<=stars;j++) {
			System.out.print("*");
		}
		
		System.out.println();
		spaces--;
		stars+=2;
	}
	
	//Lower Half 
	spaces=1;
	stars=rows*2-3;
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=spaces;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=stars;j++) {
			System.out.print("*");
		}
		System.out.println();
		spaces++;
		stars-=2;
	}
}
}

package Lern;

public class h {public static void main(String[] args) {
	int[] a = {0,2,4,1,3};
	for(int i = 0; i < a.length; i++){
	    a[i] = a[(a[i] + 3) % a.length];
	}
	System.out.println(a[1]);
}

}






//a.length = 5
//A[0] = a[(0 + 3) % 5] = a[3] = 1
//So, a[0] =  a[3] = 1
//A[1] = a[(2 + 3) % 5] = a[0] = 1
//Therefore, a[1] = 1;

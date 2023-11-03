package New3;

public class Array {

	public static void test(int[] a) {

		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] % 2 == 0) {
				System.out.print(a[i]);
			}
		}
		for (int j = 0; j <= a.length - 1; j++) {
			if (a[j] % 2 != 0) {
				System.out.print(a[j]);
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { -1, -2, 3, 4, 5, 6, 65, 75, 98, 10 };
		test(a);
	}
}

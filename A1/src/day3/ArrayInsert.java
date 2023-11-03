package day3;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToInsert = 10;
        int position = 2;

        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        newArray[position] = elementToInsert;

        for (int i = position + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }

        System.out.println("Array after insertion:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}

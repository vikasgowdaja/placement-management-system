package day9;

class GenericClass1<T> {
    private T value;

    public GenericClass1(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    // Generic method
    public static <U> void display(U item) {
        System.out.println("Item: " + item);
    }
}

public class GenericsGenericMethod {
    public static void main(String[] args) {
        // Creating a generic instance with Integer type
        GenericClass<Integer> intInstance = new GenericClass<>(10);
        int intValue = intInstance.getValue();
        System.out.println("Integer Value: " + intValue);

        // Creating a generic instance with String type
        GenericClass<String> stringInstance = new GenericClass<>("Hello");
        String stringValue = stringInstance.getValue();
        System.out.println("String Value: " + stringValue);

        // Using the generic method
        GenericClass1.display(15); // Output: Item: 15
        GenericClass1.display("World"); // Output: Item: World
    }
}


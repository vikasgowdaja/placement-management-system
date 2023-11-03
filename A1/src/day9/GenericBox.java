package day9;

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericBox {
    public static void main(String[] args) {
        // Creating a Box of Integer
        Box<Integer> intBox = new Box<>(10);
        int intValue = intBox.getValue();
        System.out.println("Integer Value: " + intValue);

        // Creating a Box of String
        Box<String> stringBox = new Box<>("Hello");
        String stringValue = stringBox.getValue();
        System.out.println("String Value: " + stringValue);
    }
}
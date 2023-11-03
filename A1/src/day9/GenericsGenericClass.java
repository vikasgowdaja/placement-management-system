package day9;

class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericsGenericClass {
    public static void main(String[] args) {
        // Creating a generic instance with Integer type
        GenericClass<Integer> intInstance = new GenericClass<>(10);
        int intValue = intInstance.getValue();
        System.out.println("Integer Value: " + intValue);

        // Creating a generic instance with String type
        GenericClass<String> stringInstance = new GenericClass<>("Hello");
        String stringValue = stringInstance.getValue();
        System.out.println("String Value: " + stringValue);
    }
}

package day4;

class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("My name is " + name + " and I'm " + age + " years old.");
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        person1.age = 25;
        person1.introduce();

        Person person2 = new Person();
        person2.name = "Jane";
        person2.age = 30;
        person2.introduce();
    }
}

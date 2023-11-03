package funtree;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private List<Person> children;

    public Person(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public List<Person> getChildren() {
        return children;
    }
}

public class HeroFamilyTree {
    public static void main(String[] args) {
        // Create the family tree
        Person superman = new Person("Superman");
        Person batman = new Person("Batman");
        Person wonderWoman = new Person("Wonder Woman");

        Person loisLane = new Person("Lois Lane");
        Person clarkKent = new Person("Clark Kent");
        Person bruceWayne = new Person("Bruce Wayne");
        Person dianaPrince = new Person("Diana Prince");

        superman.addChild(loisLane);
        superman.addChild(clarkKent);
        batman.addChild(bruceWayne);
        wonderWoman.addChild(dianaPrince);

        // Print the family tree
        printFamilyTree(superman, "");

        // Output:
        // - Superman
        // - Lois Lane
        // - Clark Kent
        // - Batman
        // - Bruce Wayne
        // - Wonder Woman
        // - Diana Prince
    }

    public static void printFamilyTree(Person person, String indent) {
        System.out.println(indent + "- " + person.getName());

        List<Person> children = person.getChildren();
        for (Person child : children) {
            printFamilyTree(child, indent + " ");
        }
    }
}
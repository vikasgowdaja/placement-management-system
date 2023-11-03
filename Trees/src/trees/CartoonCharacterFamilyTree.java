package trees;

class CartoonCharacter {
    String name;
    CartoonCharacter left;
    CartoonCharacter right;

    public CartoonCharacter(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }
}

public class CartoonCharacterFamilyTree {
    public static void main(String[] args) {
        CartoonCharacter root = new CartoonCharacter("Grandpa");

        CartoonCharacter bart = new CartoonCharacter("Bart");
        CartoonCharacter lisa = new CartoonCharacter("Lisa");
        CartoonCharacter maggie = new CartoonCharacter("Maggie");
        CartoonCharacter marge = new CartoonCharacter("Marge");
        CartoonCharacter homer = new CartoonCharacter("Homer");

        root.left = marge;
        root.right = homer;
        marge.left = bart;
        marge.right = lisa;
        homer.right = maggie;

        System.out.println("Family Tree:");

        printFamilyTree(root, "");
    }

    public static void printFamilyTree(CartoonCharacter character, String indent) {
        if (character != null) {
            System.out.println(indent + character.name);

            printFamilyTree(character.left, indent + "  ");
            printFamilyTree(character.right, indent + "  ");
        }
    }
}


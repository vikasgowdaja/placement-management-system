package trees;

class Book {
    String title;
    int height;
    Book left;
    Book right;

    public Book(String title) {
        this.title = title;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
}

public class BookTower {
    public static void main(String[] args) {
        Book root = null;

        root = insert(root, new Book("Book 1"));
        root = insert(root, new Book("Book 2"));
        root = insert(root, new Book("Book 3"));
        root = insert(root, new Book("Book 4"));
        root = insert(root, new Book("Book 5"));

        System.out.println("Books in the tower:");
        inorderTraversal(root);
    }

    public static Book insert(Book root, Book book) {
        if (root == null) {
            return book;
        }

        if (book.height < root.height) {
            root.left = insert(root.left, book);
        } else {
            root.right = insert(root.right, book);
        }

        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));

        int balance = getBalance(root);

        if (balance > 1 && book.height < root.left.height) {
            return rotateRight(root);
        }

        if (balance < -1 && book.height > root.right.height) {
            return rotateLeft(root);
        }

        if (balance > 1 && book.height > root.left.height) {
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }

        if (balance < -1 && book.height < root.right.height) {
            root.right = rotateRight(root.right);
            return rotateLeft(root);
        }

        return root;
    }

    public static int getHeight(Book book) {
        if (book == null) {
            return 0;
        }

        return book.height;
    }

    public static int getBalance(Book book) {
        if (book == null) {
            return 0;
        }

        return getHeight(book.left) - getHeight(book.right);
    }

    public static Book rotateRight(Book y) {
        Book x = y.left;
        Book T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));

        return x;
    }

    public static Book rotateLeft(Book x) {
        Book y = x.right;
        Book T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));

        return y;
    }

    public static void inorderTraversal(Book book) {
        if (book != null) {
            inorderTraversal(book.left);
            System.out.println(book.title);
            inorderTraversal(book.right);
        }
    }
}


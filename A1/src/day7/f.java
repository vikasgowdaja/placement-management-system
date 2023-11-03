package day7;

interface Printer {
    void print(String document);
}

class DotMatrixPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing document using Dot Matrix Printer: " + document);
    }
}

class LaserPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing document using Laser Printer: " + document);
    }
}

public class f {
    public static void main(String[] args) {
        Printer dotMatrixPrinter = new DotMatrixPrinter();
        Printer laserPrinter = new LaserPrinter();

        // Printing using Dot Matrix Printer
        printDocument(dotMatrixPrinter, "Sample Document");

        // Printing using Laser Printer
        printDocument(laserPrinter, "Another Document");
    }

    public static void printDocument(Printer printer, String document) {
        printer.print(document);
    }
}



package com.example;

class PackageClass1 {
    public void method() {
        System.out.println("PackageClass1 method called.");
    }
}

public class PackageClass2 {
    public static void main(String[] args) {
        PackageClass1 obj = new PackageClass1();
        obj.method();
    }
}
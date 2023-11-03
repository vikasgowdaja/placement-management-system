package day1;

public class MaxValues {
    public static void main(String[] args) {
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;
        char maxChar = Character.MAX_VALUE;
        boolean maxBoolean = Boolean.TRUE;

        System.out.println("Max Byte: " + maxByte);
        System.out.println("Max Short: " + maxShort);
        System.out.println("Max Int: " + maxInt);
        System.out.println("Max Long: " + maxLong);
        System.out.println("Max Float: " + maxFloat);
        System.out.println("Max Double: " + maxDouble);
        System.out.println("Max Char: " + (int) maxChar);
        System.out.println("Max Boolean: " + maxBoolean);
    }
}
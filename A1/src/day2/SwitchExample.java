package day2;

public class SwitchExample {
    public static void main(String[] args) {
        int number = 3;
        int dayNumber = 2;
        String dayName;

        switch (number) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break; // Skip remaining code in the switch block
            case 4:
                System.out.println("Number is 4");
                break;
            default:
                System.out.println("Number is greater than 4");
                break;
        }

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day: " + dayName);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //initalizes a string variable
        String input;
        //takes input from the user
        Scanner scanner = new Scanner(System.in);
        //tells user to enter a day of the week
        System.out.println("Please enter a day of the week: ");
        //takes user input and makes it all upper case
        input = scanner.nextLine().toUpperCase();
        //initializing a daychecker data type
        DayChecker day = new DayChecker(DayOfWeek.valueOf(input));
        day.CustomMessage();
    }
}
import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secondsRemaining = seconds % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, " + secondsRemaining + " seconds");
    }
}
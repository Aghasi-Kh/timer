import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter minute");
        int minute = scanner.nextInt();
        if (minute > 60 || minute < 0) {
            System.out.println("Minute cannot be more than 60 and less than 0");
            System.out.println("Enter minute");
            minute = scanner.nextInt();
        }
        System.out.println("Enter second");
        int second = scanner.nextInt();
        if (second > 60 || second < 0) {
            System.out.println("Second cannot be more than 60 and less than 0");
            System.out.println("Enter second");
            second = scanner.nextInt();
        }
        Timer timer=new Timer();
        timer.timer(minute,second);
    }
}
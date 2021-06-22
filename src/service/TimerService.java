package service;


import model.Timer;

public class TimerService {
    public void timer(Timer timer){
        System.out.println("Timer:");
        int min=timer.getMinute();
        int second=timer.getSecond();
        while (true) {

            System.out.println(min + "m : " + second + "s");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            second--;
            if (second < 0) {
                second = 59;
                min--;
                if (min < 0) {
                    System.out.println("Time is over!");
                    break;
                }
            }


        }
    }
}

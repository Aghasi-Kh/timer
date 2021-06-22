public class Timer {
    public void timer(int min,int second){
        System.out.println("Timer:");
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

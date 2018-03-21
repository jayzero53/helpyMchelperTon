public class question1 extends solution{

    question1(){}

    private static int x = 760;
    private static int y = 3000;
    private static int z, hours, minutes, seconds, remainder;

    public void run(){
        z = x + y;
        hours = z/3600;
        remainder = z % 3600;
        minutes = remainder / 60;
        seconds = remainder % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}

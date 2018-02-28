public class question1 {

    static int x = 760;
    static int y = 3000;
    static int z, hours, minutes, seconds, remainder;

    public static void run(){
        z = x + y;
        hours = z/3600;
        remainder = z % 3600;
        minutes = remainder / 60;
        seconds = remainder % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}

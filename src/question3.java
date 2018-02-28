public class question3 {


    public static void run(){
        int a = 5;
        int b = 10;
        int c = 15;

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int middle = (a+b+c) - max - min;

        System.out.println(min + " " + middle + " "+ max);
    }
}

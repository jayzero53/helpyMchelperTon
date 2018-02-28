import java.util.Scanner;

public class question6 {
    static String SPAM_TEMPLATE = "Dearest {0}\n" +
            "It is with a heavy heart that I inform you of the death of my father,\n" +
            "General Fayk {1}, your long lost relative from Mapsfostol.\n" +
            "My father left the sum of {2} USD for us, your distant cousins.\n" +
            "Unfortunately, we cannot access the money as it is in a bank in {3}.\n" +
            "I desperately need your assistance to access this money.\n" +
            "I will even pay you generously, 15% of the amount - {4} USD,\n" +
            "for your help.  Please get in touch with me at this email address asap.\n" +
            "Yours sincerely\n" +
            "Arnrial {1}";

    public static void run(){
        Scanner console = new Scanner(System.in);
        String[] array;
        String name = ("");
        int hoursWorked;
        int rate;
        double pay = 0;
        final int HOURS_IN_WK = 40;
        final double OVERTIME_RATE= 1.5;

//        System.out.print("Please enter your name: ");
//        name =  console.nextLine();
        System.out.print("Please enter your hours worked: ");
        hoursWorked= console.nextInt();
        System.out.print("Please enter your rate");
        rate= console.nextInt();

        if (hoursWorked > HOURS_IN_WK)
        {

            int normalPay = rate * HOURS_IN_WK;
            double overtimeHours = (hoursWorked - HOURS_IN_WK);
            double overtimePay = overtimeHours * (OVERTIME_RATE * rate);
            pay = normalPay + overtimePay;
        }

        System.out.print("Pay: " + pay);

    }
}

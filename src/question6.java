import java.util.Scanner;

public class question6 extends solution{

    question6(){}

    public void run(){
        Scanner console = new Scanner(System.in);
        int hoursWorked;
        int rate;
        double pay = 0;
        final int HOURS_IN_WK = 40;
        final double OVERTIME_RATE= 1.5;

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

import java.util.Scanner;

class telkomTask extends solution{

    telkomTask(){}

    private static String custAreaCode, custPhoneNumber;
    private static String calledAreaCode, calledPhoneNumber;
    private static float callDuration;
    private static float priceOfCall;

    public void run(){
        getCallDetails();

        if(custAreaCode.equals(calledAreaCode)){
            return;
        }

        if(callDuration > 20){
            priceOfCall = callDuration * 30;
        }
        else {
            priceOfCall = callDuration * 50;
        }

        System.out.println("Customer number, called number, duration, price");
        System.out.println(custPhoneNumber + ",  " + calledPhoneNumber + ",  " +  callDuration + ",  " + priceOfCall);
    }

    private static void getCallDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter customers area code");
        custAreaCode = scanner.nextLine();
        System.out.println("enter customers phone number");
        custPhoneNumber = scanner.nextLine();

        System.out.println("enter called area code");
        calledAreaCode = scanner.nextLine();
        System.out.println("enter called phone number");
        calledPhoneNumber = scanner.nextLine();

        System.out.println("enter call duration");
        callDuration = scanner.nextFloat();
    }
}

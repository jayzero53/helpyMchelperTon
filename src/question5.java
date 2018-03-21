import java.text.MessageFormat;
import java.util.Scanner;

public class question5 extends solution {
    question5(){}

    private static String SPAM_TEMPLATE = "Dearest {0}\n" +
            "It is with a heavy heart that I inform you of the death of my father,\n" +
            "General Fayk {1}, your long lost relative from Mapsfostol.\n" +
            "My father left the sum of {2} USD for us, your distant cousins.\n" +
            "Unfortunately, we cannot access the money as it is in a bank in {3}.\n" +
            "I desperately need your assistance to access this money.\n" +
            "I will even pay you generously, 15% of the amount - {4} USD,\n" +
            "for your help.  Please get in touch with me at this email address asap.\n" +
            "Yours sincerely\n" +
            "Arnrial {1}";

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name");
        String fullName = scanner.nextLine();
        String firstName = fullName.split(" ")[0];
        String lastName = fullName.split(" ")[1];

        System.out.println("Enter sum of money in USD");
        int money = scanner.nextInt();

        System.out.println("Enter country name");
        scanner.nextLine();
        String countryName = scanner.nextLine();

        float perc15 = (money * 100.0f) / 15;

        String spam = MessageFormat.format(SPAM_TEMPLATE, firstName, lastName, money, countryName, perc15);
        System.out.println();
        System.out.println(spam);

    }


}

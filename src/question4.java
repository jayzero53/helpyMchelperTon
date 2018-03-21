import java.util.Scanner;

public class question4 extends solution {

    question4(){}

    public void run(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width 1:");
        int width1 = scanner.nextInt();
        System.out.println("Enter height 1:");
        int height1 = scanner.nextInt();

        System.out.println("Enter width 2:");
        int width2 = scanner.nextInt();
        System.out.println("Enter height 2:");
        int height2 = scanner.nextInt();

        int meters = (2 * width1) + (2*height1) + 2*(width2);
        System.out.println("Enter price per meter:");
        float pricePerMeter = scanner.nextFloat();

        System.out.println("The total fence required is: " + meters);
        System.out.println("The total price of the fence is: R " + (pricePerMeter*meters) );
    }
}

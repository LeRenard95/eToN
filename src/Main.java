import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double e = Math.E;

        Scanner eScan = new Scanner(System.in);
        System.out.println("Type number 1-5");
        int numberScan = eScan.nextInt();


        switch (numberScan){

            case 1:
                System.out.format("%.1f", e);

                break;

            case 2:
                System.out.format("%.2f", e);

                break;

            case 3:
                System.out.format("%.3f", e);

                break;

            case 4:
                System.out.format("%.4f", e);

                break;

            case 5:
                System.out.format("%.5f", e);

                break;

        }
System.out.println();

    }
}
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times do you eat beef per day?");
        int beef = Integer.valueOf(scanner.nextLine());
        System.out.println("How many hours a day do you use your car? ");
        int car = Integer.valueOf(scanner.nextLine());
        System.out.println("How  many hours a day do you use your AC?");
        int AC = Integer.valueOf(scanner.nextLine());
        System.out.println("True or false, Do you charge your phone every day? ");
        boolean phone = Boolean.valueOf(scanner.nextLine());
        System.out.println("How  many hours a day do you use your TV?");
        int TV = Integer.valueOf(scanner.nextLine());
        System.out.println("how many showers do you take in a day?");
        int shower = Integer.valueOf(scanner.nextLine());
        int caruse = car * 200;
        int ACuse = AC * 350;
        int beefuse = beef * 6800;
        int TVuse = TV * 30;
        int showeruse = shower * 400;
        int total = ACuse + caruse + beefuse + TVuse + showeruse;
        if (phone) {
            total += 10;
        }
        double totalkg = total / 1000.0;
        System.out.println("You produce on average " + totalkg +" kilograms of CO2 per day");
    }
}

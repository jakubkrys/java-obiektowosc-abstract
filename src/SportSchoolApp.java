import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SportSchoolApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        SportSchoolAppRepo sportSchoolAppRepo = new SportSchoolAppRepo();
        int option;

        do {
            System.out.println("--- Sport School App");
            System.out.println("1 - add footballer");
            System.out.println("2 - add runner");
            System.out.println("3 - add swimmer");
            System.out.println("4 - show info");
            System.out.println("5 - start training");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}

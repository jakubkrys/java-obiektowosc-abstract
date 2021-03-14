import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SportSchoolApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        SportSchoolAppRepo sportSchoolAppRepo = new SportSchoolAppRepo();
        int option;
        String personName;
        String personSurname;
        int birthYear;
        String diet;
        int initYear;
        String clubName;
        int establishmentYear;
        Club club;

        do {
            System.out.println("--- Sport School App");
            System.out.println("1 - add footballer");
            System.out.println("2 - add runner");
            System.out.println("3 - add swimmer");
            System.out.println("4 - display all sportmens");
            System.out.println("5 - start training");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:
                    System.out.print("Name: ");
                    personName = scanner.nextLine();
                    System.out.print("Surname: ");
                    personSurname = scanner.nextLine();
                    System.out.print("Birth year: ");
                    birthYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Diet: ");
                    diet = scanner.nextLine();
                    System.out.print("Start year: ");
                    initYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Club name: ");
                    clubName = scanner.nextLine();
                    System.out.print("Establishment year: ");
                    establishmentYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Position: ");
                    String position = scanner.nextLine();

                    club = new Club(clubName,establishmentYear);
                    Footballer footballer = new Footballer(personName,personSurname,birthYear,diet,initYear,club,position);
                    sportSchoolAppRepo.add(footballer);
                    break;
                case 2:
                    System.out.print("Name: ");
                    personName = scanner.nextLine();
                    System.out.print("Surname: ");
                    personSurname = scanner.nextLine();
                    System.out.print("Birth year: ");
                    birthYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Diet: ");
                    diet = scanner.nextLine();
                    System.out.print("Start year: ");
                    initYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Club name: ");
                    clubName = scanner.nextLine();
                    System.out.print("Establishment year: ");
                    establishmentYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Favourite distance: ");
                    String favouriteDistance = scanner.nextLine();
                    System.out.print("Best running time: ");
                    String bestRunTime = scanner.nextLine();

                    club = new Club(clubName,establishmentYear);
                    Runner runner = new Runner(personName,personSurname,birthYear,diet,initYear,club,favouriteDistance,bestRunTime);
                    sportSchoolAppRepo.add(runner);
                    break;
                case 3:
                    System.out.print("Name: ");
                    personName = scanner.nextLine();
                    System.out.print("Surname: ");
                    personSurname = scanner.nextLine();
                    System.out.print("Birth year: ");
                    birthYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Diet: ");
                    diet = scanner.nextLine();
                    System.out.print("Start year: ");
                    initYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Club name: ");
                    clubName = scanner.nextLine();
                    System.out.print("Establishment year: ");
                    establishmentYear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Favourite swimming style: ");
                    String favouriteStyle = scanner.nextLine();
                    System.out.println("Best swimming time: ");
                    String bestSwimTime = scanner.nextLine();

                    club = new Club(clubName,establishmentYear);
                    Swimmer swimmer = new Swimmer(personName,personSurname,birthYear,diet,initYear,club,favouriteStyle,bestSwimTime);
                    sportSchoolAppRepo.add(swimmer);
                    break;
                case 4:
                    sportSchoolAppRepo.displayAll();
                    break;
                case 5:
                    System.out.println("1 - Footballer");
                    System.out.println("2 - Runner");
                    System.out.println("3 - Swimmer");
                    option = scanner.nextInt();
                    scanner.nextLine();

                    switch(option){
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}

public class Runner extends Sportsman{

    private String favouriteDistance;
    private String bestTime;

    public Runner(String personName, String personSurname, int birthYear, String diet, int initYear, Club club, String favouriteDistance, String bestTime) {
        super(personName, personSurname, birthYear, diet, initYear, club);
        this.favouriteDistance = favouriteDistance;
        this.bestTime = bestTime;
    }

    @Override
    public void train() {
        System.out.println("Biegam");
    }
}

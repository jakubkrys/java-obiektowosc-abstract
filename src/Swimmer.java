public class Swimmer extends Sportsman {

    private String favouriteStyle;
    private String bestTime;

    public Swimmer(String personName, String personSurname, int birthYear, String diet, int initYear, Club club, String favouriteStyle, String bestTime) {
        super(personName, personSurname, birthYear, diet, initYear, club);
        this.favouriteStyle = favouriteStyle;
        this.bestTime = bestTime;
    }

    @Override
    public void train() {
        System.out.println("Pływam");
    }
}

public class Swimmer extends Sportsman {

    private String favouriteStyle;
    private String bestSwimTime;

    public Swimmer(String personName, String personSurname, int birthYear, String diet, int initYear, Club club, String favouriteStyle, String bestSwimTime) {
        super(personName, personSurname, birthYear, diet, initYear, club);
        this.favouriteStyle = favouriteStyle;
        this.bestSwimTime = bestSwimTime;
    }

    @Override
    public void train() {
        System.out.println("Pływam");
    }
}

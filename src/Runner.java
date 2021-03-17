public class Runner extends Sportsman{

    private String favouriteDistance;
    private String bestRunTime;

    public Runner(String personName, String personSurname, int birthYear, String diet, int initYear, Club club, String favouriteDistance, String bestRunTime) {
        super(personName, personSurname, birthYear, diet, initYear, club);
        this.favouriteDistance = favouriteDistance;
        this.bestRunTime = bestRunTime;
    }

    @Override
    public void train() {
        System.out.println("Biegam");
    }

    @Override
    public void display() {
        System.out.println("Favourite distance: "+favouriteDistance);
        System.out.println("Best run time: "+bestRunTime);
    }
}

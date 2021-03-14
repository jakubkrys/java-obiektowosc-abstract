public abstract class Sportsman extends Person {

    private String diet;
    private int initYear;
    Club club;

    public Sportsman(String personName, String personSurname, int birthYear, String diet, int initYear, Club club) {
        super(personName, personSurname, birthYear);
        this.diet = diet;
        this.initYear = initYear;
        this.club = club;
    }

    public abstract void train();
}

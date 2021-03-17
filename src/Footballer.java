public class Footballer extends Sportsman{

    private String position;

    public Footballer(String personName, String personSurname, int birthYear, String diet, int initYear, Club club, String position) {
        super(personName, personSurname, birthYear, diet, initYear, club);
        this.position = position;
    }

    @Override
    public void train() {
        System.out.println("Gram w piłkę");
    }

    @Override
    public void display() {
        System.out.println("Position: "+position);
    }
}

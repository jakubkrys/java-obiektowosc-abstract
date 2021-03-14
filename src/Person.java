public class Person {

    Sportsman sportsman;
    private String personName;
    private String personSurname;
    private int birthYear;

    public Person(String personName, String personSurname, int birthYear) {
        this.personName = personName;
        this.personSurname = personSurname;
        this.birthYear = birthYear;
    }

    public void train(){
        sportsman.train();
    }
}

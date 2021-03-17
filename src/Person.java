public class Person {

    private String personName;
    private String personSurname;
    private int birthYear;


    public Person(String personName, String personSurname, int birthYear) {
        this.personName = personName;
        this.personSurname = personSurname;
        this.birthYear = birthYear;
    }

    public void display(){
        System.out.println("Name: "+personName);
        System.out.println("Surname: "+personSurname);
        System.out.println("Birth year: "+birthYear);
    }

    public void train() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personSurname='" + personSurname + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}

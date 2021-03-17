public class SportSchoolAppRepo {

    Person[] persons = new Person[20];
    private int personIndex = 0;

    public void add(Person person){
        if(personIndex == persons.length){
            personIndex = 0;
        }
        persons[personIndex++] = person;
    }

    public void displayAll(){
        for (int i = 0; i < personIndex; i++) {
            System.out.println(persons[i]);
        }
    }

    public void train() {
        for (int i = 0; i < personIndex; i++) {
            persons[i].train();
        }
    }
}

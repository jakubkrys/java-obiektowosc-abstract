public class SportSchoolAppRepo {

    Person[] persons = new Person[20];
    private int personIndex = 0;

    public void add(Person person){
        if(personIndex == persons.length){
            personIndex = 0;
        }
        persons[personIndex++] = person;
    }
}

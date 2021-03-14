public class Club {

    private String clubName;
    private int establishmentYear;

    public Club(String clubName, int establishmentYear) {
        this.clubName = clubName;
        this.establishmentYear = establishmentYear;
    }

    public void display(){
        System.out.println("Club name: "+clubName);
        System.out.println("Establishment: "+establishmentYear);
    }
}

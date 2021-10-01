public class Equipment {
    private int id;
    private String location;
    private int yearOfPurchase;

    public Equipment(){}

    public Equipment(int id, String location, int yearOfPurchase){
       this.id=id;
       this.location=location;
       this.yearOfPurchase=yearOfPurchase;
   }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setYearOfPurchase(int yearOfPurchase) {
        this.yearOfPurchase = yearOfPurchase;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getYearOfPurchase() {
        return yearOfPurchase;
    }
}

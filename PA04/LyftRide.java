public class LyftRide{
  private int customerID;
  private double numMiles;
  private double numMinutes;

  public LyftRide(int customerID, double numMiles, double numMinutes){
    this.customerID = customerID;
    this.numMiles = numMiles;
    this.numMinutes = numMinutes;
  }

  public String toString(){
    return "("+customerID+","+numMiles+","+numMinutes+")";
  }
}

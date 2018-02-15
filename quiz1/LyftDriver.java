public class LyftDriver{
  private double totalPay;
  private int numRides;
  private String driverName;
  private int driverID;
  private double pickupfee;
  private double distanceFee;
  private double timeFee;

  public LyftDriver(String driverName,int driverID,double pickupfee,double distanceFee,double timeFee){
    this.driverName = driverName;
    this.driverID = driverID;
    this.pickupfee = pickupfee;
    this.distanceFee = distanceFee;
    this.timeFee = timeFee;
  }

  public String toString(){
    return "driverName: "+driverName+", driverID: "+driverID+", totalPay: "+totalPay+",numRides: "+numRides;
  }

  public void completeRide(int passengerId, double distance, double time){
    this.totalPay += this.pickupfee+this.distanceFee*distance+this.timeFee*time;
    this.numRides += 1;
  }
  public double getTotalPay(){
    return this.totalPay;
  }

  public int getNumRides(){
    return this.numRides;
  }
}

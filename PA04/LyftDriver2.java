public class LyftDriver2{
  private double totalPay;
  private int numRides;
  private String driverName;
  private int driverID;
  private double pickupfee;
  private double distanceFee;
  private double timeFee;
  private LyftRide[] rides = new LyftRide[10000];

  public LyftDriver2(String driverName,int driverID,double pickupfee,double distanceFee,double timeFee){
    this.driverName = driverName;
    this.driverID = driverID;
    this.pickupfee = pickupfee;
    this.distanceFee = distanceFee;
    this.timeFee = timeFee;
  }

  public String toString(){
    return "driver("+driverName+","+driverID+","+totalPay+","+numRides+")";
  }

  public void completeRide(int passengerId, double distance, double time){
    this.rides[this.numRides] = new LyftRide(passengerId,distance,time);
    this.totalPay += this.pickupfee+this.distanceFee*distance+this.timeFee*time;
    this.numRides += 1;
  }

  public LyftRide[] getRides(){
    LyftRide[] ride = new LyftRide[this.numRides];
    for(int i=0; i<ride.length;i++){
      ride[i] = this.rides[i];
    }
    return ride;
  }
}

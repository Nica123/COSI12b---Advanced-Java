/**
The CarPool class represent a carpooling vehicle.
It has a constructor that allows you to create a Carpool by specifying
<ul>
<li> The name of the owner of the car, e.g. "Tim Hickey"</li>
<li> The pick up place, e.g. "Coolidge Corner"</li>
<li> The pick up time  e.g. "8 am"</li>
<li> The departure time, e.g. "5 pm"</li>
<li> The number of possible carpoolers e.g. 4</li>
</ul>
These values should be stored in private instance variables.
You should write the constructor to create a carpool object from this information,
e.g.
CarPool car = new CarPool("Tim Hickey","Coolidge Corner","8 am","5 pm", 4);

You should write the following instance methods:

toString() method which will produce the following String
representation for the object:
car.toString() -->
carpool(Tim Hickey leaves Coolidge Corner at 8 am returns 5 pm has 4 available seats)

addRider() --> which decreases the number of available seats by 1

removeRider() --> which increases the number of available seats by 1

getAvailableSeats() --> which returns the number of available getAvailableSeats

*/
  public class CarPool{
  private String owner;
  private String pickupplace;
  private String pickuptime;
  private String departuretime;
  private int carpooler;
  private int rider =0;

  public CarPool(String owner,String pickupplace,String pickuptime,String departuretime,int carpooler){
    this.owner = owner;
    this.pickupplace = pickupplace;
    this.pickuptime = pickuptime;
    this.departuretime = departuretime;
    this.carpooler = carpooler;
  }

  public String toString(){
    return "carpool(" + this.owner + "," +this.pickupplace +"," +this.pickuptime+","+this.departuretime+","+this.carpooler+")";
  }

  public void addRider(int a){
    if(this.rider+a <= this.carpooler){
      this.rider = this.rider+a;
    } else{
      throw new Exception("rider can not be under 0");
    }
  }

  public void removeRider(int a){
    if(this.rider-a>=0){
      this.rider = this.rider - a;
    } else{
      throw new Exception("rider can not be under 0");
    }
  }

  public int getAvailableSeats(){
    return this.carpooler - this.rider;
  }
}

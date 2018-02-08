public class Interval{
  /**
  lo is the lower bond of interval
  hi is the higher bond of interval
  */
  private double lo;
  private double hi;

  /**
  this construct the object Interval with two input
  @param lo the lower bond of interval
  @param hi the higher bond of interval
  */
  public Interval(double lo, double hi){
    if(lo<hi){
      this.hi = hi;
      this.lo = lo;
    } else {
      this.hi = lo;
      this.lo = hi;
    }
  }

  /**
  this construct the object Interval with one input
  @param hi both the lower and higher bond of the interval
  */
  public Interval(double hi){
    this.hi = hi;
    this.lo = hi;
  }

  /**
  this is a toString method on object
  */
  public String toString(){
    return "[" +this.lo+","+this.hi+"]";
  }

  /**
  add two Interval into one
  @param a one Interval
  @param b another interval
  @return the conbined interval
  */
  public static Interval add(Interval a, Interval b){
    double c,d;
    c = a.lo + b.lo;
    d = a.hi + b.hi;
    Interval x = new Interval(c,d);
    return x;
  }

  /**
  subtract one interval from another
  @param a one interval
  @param b one interval been subtracted
  @return the result of subtraction
  */
  public static Interval subtract(Interval a, Interval b){
    double c,d;
    c = a.lo - b.hi;
    d = a.hi - b.lo;
    Interval s = new Interval(c,d);
    return s;
  }

  /**
  get the smallest number from 4 numbers
  @param a first number
  @param b second number
  @param c thrid number
  @param d fourth number
  @return the smallest number
  */
  private static double smallest(double a, double b, double c, double d){
    double[] f = {a,b,c,d};
    double e = a;
    for(int i=0;i<4;i++){
      if(e>f[i]){
        e=f[i];
      }
    }
    return e;
  }

  /**
  get the largest number from 4 numbers
  @param a first number
  @param b second number
  @param c thrid number
  @param d fourth number
  @return the largest number
  */
  private static double highest(double a, double b, double c, double d){
    double[] f = {a,b,c,d};
    double e = a;
    for(int i=0;i<4;i++){
      if(e<f[i]){
        e=f[i];
      }
    }
    return e;
  }

  /**
  multiply one interval with another
  @param a one interval
  @param b another interval
  @return the result of multiplication
  */
  public static Interval multiply(Interval a, Interval b){
    double c,d;
    c = smallest(a.hi*b.hi,a.lo*b.hi,a.lo*b.lo,a.hi*b.lo);
    d = highest(a.hi*b.hi,a.lo*b.hi,a.lo*b.lo,a.hi*b.lo);
    Interval u = new Interval(c,d);
    return u;
  }

  /**
  divide one interval by another
  @param a one interval
  @param b the divisor
  @return the result of division
  */
  public static Interval divide (Interval a, Interval b) throws Exception {
    double c,d;
    if(b.hi*b.lo > 0){
      c = smallest(a.hi/b.hi,a.lo/b.hi,a.lo/b.lo,a.hi/b.lo);
      d = highest(a.hi/b.hi,a.lo/b.hi,a.lo/b.lo,a.hi/b.lo);
      Interval z = new Interval(c,d);
      return z;
    } else {
      throw new ArithmeticException("b can not contain zero in its interval");
    }
  }

  /**
  get the higher bond value in this object
  */
  public double getHi(){
    return this.hi;
  }

  /**
  get the lower bond value in this object
  */
  public double getLo(){
    return this.lo;
  }

  /**
  check if two Interval are equal
  @param b the Interval been compared
  @return true if equal and false if not equal
  */
  public boolean equals(Interval b){
    if(this.hi == b.hi && this.lo == b.lo){
      return true;
    } else{
      return false;
    }
  }
}

public class Interval{
  private double lo;
  private double hi;

  public Interval(double lo, double hi){
    if(lo<hi){
      this.hi = hi;
      this.lo = lo;
    } else {
      this.hi = lo;
      this.lo = hi;
    }
  }

  public Interval(double hi){
    this.hi = hi;
    this.lo = hi;
  }

  public String toString(){
    return "[" +this.lo+","+this.hi+"]";
  }

  public static Interval add(Interval a, Interval b){
    double c,d;
    c = a.lo + b.lo;
    d = a.hi + b.hi;
    Interval x = new Interval(c,d);
    return x;
  }

  public static Interval subtract(Interval a, Interval b){
    double c,d;
    c = a.lo - b.hi;
    d = a.hi - b.lo;
    Interval s = new Interval(c,d);
    return s;
  }

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


  public static Interval multiply(Interval a, Interval b){
    double c,d;
    c = smallest(a.hi*b.hi,a.lo*b.hi,a.lo*b.lo,a.hi*b.lo);
    d = highest(a.hi*b.hi,a.lo*b.hi,a.lo*b.lo,a.hi*b.lo);
    Interval u = new Interval(c,d);
    return u;
  }

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

  public double getHi(){
    return this.hi;
  }

  public double getLo(){
    return this.lo;
  }

  public boolean equals(Interval b){
    if(this.hi == b.hi && this.lo == b.lo){
      return true;
    } else{
      return false;
    }
  }
}


/**
The main method of this class tests all of the constructors and methods of the Interval class
*/
public class TestInterval{
	public static void main(String[] args){
		System.out.println("\n\nTesting the Interval class\n\n");
		Interval a = new Interval(1,2);
		Interval b = new Interval(-5,-2);
		Interval c = new Interval(2,4);
		Interval d = new Interval(-2,2);
		Interval e = new Interval(4);
		System.out.println("a="+a+
		   " and it should be [1.0,2.0]");
		System.out.println("b="+b+
		   " and it should be [-5.0,-2.0]");
		System.out.println("c="+c+
		   " and it should be [2.0,4.0]");
	  System.out.println("d="+d+
	 		 " and it should be [-2.0,2.0]");
		System.out.println("e="+e+
		 	 " and it should be [4.0,4.0]");

		System.out.println("a+b="+Interval.add(a,b)+
        " and it should be [-4.0,0.0]\n");

		System.out.println("a-b="+Interval.subtract(a,b)+
		   " and it should be [3.0,7.0]");
		System.out.println("a*b="+Interval.multiply(a,b)+
		   " and it should be [-10.0,-2.0]");
		System.out.println("a/b="+Interval.divide(a,b)+
		   " and it should be [-1.0,-0.2]");

		System.out.println("b*d="+Interval.multiply(b,d)+
		   " and it should be [-10.0,10.0]");
		System.out.println("c/a="+Interval.divide(c,a)+
		   " and it should be [1.0,4.0]");
		System.out.println("b/a="+Interval.divide(b,a)+
		   " and it should be [-5.0,-1.0]");
		System.out.println("b/d="+Interval.divide(b,d)+
		   " and it should be [-2.5,2.5]");
    System.out.println(a.equals(b));
		System.out.println(a.getHi());

	}
}

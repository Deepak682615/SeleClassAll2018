package TestNG;

public class Deepak {
	int x,y;

	static public  void main(String args[]) {
	
		System.out.println("Testing Class");
		
		double a =12;
		System.out.println(a/0);
		
		Deepak ref = new Deepak();
		//ref.method1();
		ref.method();
	
		
		Morning morn = new Morning();
		morn.morning();
	}

	
	public void method () {
		x=20;
		y=50;
		
		System.out.println(x+y);
		System.out.println(x+y+"20"+(x+y));
	}
	
	public  void method1 () {
		x=100;
		System.out.println(x);
	}
}

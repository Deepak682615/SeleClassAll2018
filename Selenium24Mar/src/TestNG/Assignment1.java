package TestNG;

public class Assignment1 {

	public static void main(String[] args) {
		/*String x="We are learning";
		String y="mistakes happen";
		int z=1000;
		System.out.println("Java is easy."+x+" selenium and "+y+" "+z +" times");
		*/
		
	
	/*    for(int i=1;i<=50;i++){  
	        System.out.println(i*2);  */
		
//	    for(int i=1;i<=100;i++){  
//	    	
//	    if (i%5==0) {
//	        System.out.println(i+" is divisble by 5");  
//	    }
//	        else {
//	        	System.out.println(i);
//	        }
//	    }
			/*int y=0;
		for(int i=0;i<=100;i++){  
			y=i+y;
			System.out.println(y);
		}*/
	         
/*		{
	        int i = 0;
	        for(;i <= 5; ++i )
	        {
	            System.out.println("i = " + i );
	        }

	        System.out.println("i after the loop = " + i );
	    }
	}
		
		*/

//------Fobinacci:
/*		int a=0;
		int b=1;
		int sum;
		
		System.out.println(a);//0
		System.out.println(b);//1
		
		for (int i = 0; i <5 ; i++) {
			sum = a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			}
			*/
	
		
		String a="bob1";
		
		String b="";
		
		
		for (int i = a.length()-1 ; i >=0 ; i--) {
			
			b=b + a.charAt(i);
			
		}
		
		if (a.equals(b)) {
			System.out.println("Pali");
			
		}
		
		System.out.println(b);
		
		StringBuffer g = new StringBuffer(a);
		g.reverse();
		System.out.println(g);
		
		
	}

}
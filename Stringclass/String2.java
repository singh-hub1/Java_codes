package Stringclass;

public class String2 {

	public static void main(String[] args) {
		
		int a=10;
		float b=123.56457f;
		char c='A';
		String str="vishal singh";
		
		System.out.printf("Hello %d %s %f %c World \n",a,str,b,c);
		
		System.out.printf("%3$s %2$f %1$d\n",a,b,str);

		System.out.printf("%5d\n",a);
		
		System.out.printf("%05d\n",a);
		
		int x=-9;
		
		System.out.printf("%(5d\n",x); 
		//Bracket only apply when number is negative.
		
		System.out.printf("%+5d %+6d\n",x,a);
		
		System.out.printf("%6.2f\n",b); //123.56
		
	    System.out.printf("%-20s\n",str); //It will print left hand side
	    
	    System.out.printf("%20s\n",str); //It will print right hand side
	}

}

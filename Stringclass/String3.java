package Stringclass;

public class String3 {

	public static void main(String[] args) {
     
	  	String str1="vishal singh";  //Object is created in POOL
	  	String str2=new String("vishal singh"); //Object is created in HEAP
	  	String str3="vishal singh";
	  	
	  	System.out.println(str1==str3);//true
	  	System.out.println(str1==str2); //false
	  	
	  	        //  0   1   2   3   4   5
  	  	char c[]= {'v','i','s','h','a','l'};
	  	String str4=new String(c,1,3); //String Constructors
	  	System.out.println(str4);//ish
	  	
	  	        // 0  1  2  3
	  	byte b[]= {65,66,67,68};
	  	String str5=new String(b,2,2);
	  	System.out.println(str5); //CD
	  	
	  	
	}

}

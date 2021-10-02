package Stringclass;

public class stringMethods {

	public static void main(String[] args) {
		
		String str=new String("  Eclipse   ");
		
		System.out.println(str.length());  //7
		
		str=str.toLowerCase();
		System.out.println(str); //eclipse
		
		str=str.toUpperCase();
		System.out.println(str); //ECLIPSE
		
		str=str.trim();
		System.out.println(str);
		
		String str1=str.substring(3);
		System.out.println(str1);//IPSE
		
		String str2=str.substring(1,3); //Here 3rd index is excluded
		System.out.println(str2);//CL
		
		String str3=str.replace('E','e');
		System.out.println(str3+" "+str);
		
		
	}

}

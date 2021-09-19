//to help Vishal,find the highest mark and average mark secured by him in "s" number of subjects.

import java.util.Scanner;
public class Exercise_5
{
    public static void main(String[] args) 
{
           Scanner s = new Scanner(System.in);
          double mark_avg;
         int result;
         int i;
         int y;
       y = s.nextInt();
      int[] arr = new int[y];    //dynamic allocate memory
      for(i=0;i<arr.length;i++)
        {
             arr[i]=s.nextInt();
          }
       int max=arr[0];
      double sum=arr[0];  
   for(i=1;i<arr.length;i++)
      { 
         sum=sum+arr[i]; 
         if(arr[i]>max)
            max =arr[i];
       }
	
    result=max;	
    mark_avg=sum/(arr.length);    
    System.out.println(result);
    System.out.println(mark_avg);
 }
}
//to calculate sum of  all the numbers divisible by 3 from 0 to n. Print the sum.
import java.util.Scanner;
public class Exercise_3
{
 public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 int sum=0;
int result=1;
int i=0;
while(result<=n)
{
    if(i%2==0)
     {
        if(i%3==0)
         {
             sum=sum+i;
         }
        result=result+1;
   }
  i=i+1;
}
System.out.println(sum);
}
}

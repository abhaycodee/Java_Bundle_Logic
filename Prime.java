import java.util.Scanner;

public class Prime{

public static void main(String [] arg){



Scanner sc=new Scanner(System.in);

System.out.println("enter the number to find the prime or not......");

 int number=sc.nextInt();
int count=0;

for(int i=2;i<number;i++)
{

if(number%i==0)
{
count++;
break;
}

}

if(count>0)
{
System.out.println("number is not prime...");
}

else{
System.out.println("number is prime ....");
}







}
}
public class Prime_notprime{

public static void main(String [] arg)
{


int number=20;
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
System.out.println("number is not prime");
}
else{
System.out.println("number is prime");
}





}
}
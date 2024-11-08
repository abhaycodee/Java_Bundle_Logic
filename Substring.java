public class Substring{

public static void main(String [] args)
{


String name="my name is abhay saini";

String sub="myname";

// now aim is to find the substring abhay is present or not in given string simply return true and false

int n=name.length();

boolean flag=false;

for(int i=0;i<n;i++)
{

String temp="";

for(int j=i;j<n;j++)
{

temp=name.substring(i,j);

if(sub.equals(temp))
{
flag=true;
}
}
if(flag==true)
{
break;
}
}


if(flag==true)
{
System.out.println("found ...");
}
else{
System.out.println("not found ...");
}





}
}




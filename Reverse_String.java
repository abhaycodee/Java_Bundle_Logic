public class Reverse_String{

public static void main(String []arg)
{


String name="abhay";

// we have to reverse the order of the string literal "name"

String rev="";

for(int i=name.length()-1;i>=0;i--)
{

char c=name.charAt(i);
rev=rev+c;
}

System.out.println("the reverse of the numbere is ="+rev);

}
}
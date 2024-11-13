public class BinarySearch{


public static void main(String [] arg)

{

//we are given a sorted list of element and we have to find the given element in that list using binarysearch algo


int [] arr={3,5,7,9,12,23,34,34,56,78,90};

int li=0;
int hi=arr.length-1;
int mi=(li+hi)/2;
int search=56;

while(li<=hi)
{

if(search==arr[mi])
{
System.out.print("the element is found at index ="+mi);
break;
}
else if(search<arr[mi])
{
hi=mi-1;
}
else{

li=mi+1;
}

mi=(li+hi)/2;


}

if(li>hi)
{
System.out.println("element not found ......");
}










}
}

import java.util.HashMap;
public class InsertionSort{

public static void main(String [] arg)
{


int [] arr={23,45,56,34,233,23,87,565,1,6,3,5};

// we have to sort this array in ascending order by InsertionSort algo

int temp=0;
int j=0;

for(int i=0;i<arr.length;i++)
{

temp=arr[i];
j=i;

while(j>0&&arr[j-1]>temp)
{
arr[j]=arr[j-1];
j=j-1;

}
arr[j]=temp;

}



// print the sorted list of the element of the InsertionSort

for(int i=0;i<arr.length;i++)
{

System.out.print(arr[i]+" ");


}






}
}

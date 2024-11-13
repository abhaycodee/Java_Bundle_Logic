public class SelectionSort{

public static void main(String[]arg)
{


int [] arr={23,45,12,18,14,56,987,354,3,8,4};

// we have to sort the array arr in the ascending order

int size=arr.length;
int min=0;
for(int i=0;i<size;i++)
{
min=i;

for(int j=i+1;j<size;j++)
{

if(arr[min]>arr[j])
{
min=j;

}

}

int temp=0;
temp=arr[min];
arr[min]=arr[i];
arr[i]=temp;

}



// printing the sorted array

for(int i=0;i<size;i++)
{
System.out.print(arr[i]+" ");

}







}
}
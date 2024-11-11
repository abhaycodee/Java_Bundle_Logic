public class SelectionSort{

public static void main(String []args)
{

// objective: here we are given a unsorted array we have to sort this array in ascending order


int [] arr={56,78,23,12,34,29,346788,545,342,10,156,76,7236,2,8,4,6,2,7};

int size=arr.length;
int min=0;
int temp=0;

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
temp=arr[i];
arr[i]=arr[min];
arr[min]=temp;
}


// printing the soreted array using for loop

for(int i=0;i<size;i++)
{
System.out.print(arr[i]+" ");
}



}
}
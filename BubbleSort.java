public class BubbleSort{

public static void main(String[]args)
{

// we are given with the array of integer in unsorted order we have to sort this array in specific order

int [] arr={12,3,45,23,2,6,23,35,10,9,60};

int size=arr.length;

for(int i=0;i<size-1;i++)
{
for(int j=0;j<size-1-i;j++)
{

if(arr[j]>arr[j+1])
{
int temp=0;
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
  




}
}

// array after the sort;

for(int i=0;i<size;i++)
{

System.out.print(arr[i]+" ");


}

}
}

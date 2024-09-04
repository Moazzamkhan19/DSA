import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[]{2,3,6,5,9,1,4,8,7};
        //-------------------linear search---------------------//
        System.out.println("Enter the value u want to find");
        int val=sc.nextInt();
        /*for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==val)
            {
                System.out.println("value found at index "+i);

            }
        }*/
        //-----------------Bubble sort--------------------------//
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=0;j< arr.length-1-i;j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        //-----------------Binary search------------------------//

        int low=0;
        int high= arr.length-1;
        boolean found=false;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==val)
            {
                System.out.println("value found at index "+mid);
                found=true;
                break;
            }
            else if(arr[mid]>val)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
    }
}
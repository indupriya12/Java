import java.io.*;
import java.util.*;
public class BinarySearchDemo{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int pos=-1;
        System.out.println("Enter no.of elements of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key element to search: ");
        int key=sc.nextInt();
        int low,high,mid;
        low=0;
        high=n-1;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]==key){
                pos=mid+1;
                break;
            }
            else if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(pos==-1)
        {
            System.out.println("Search unsuccessful element not found in the array");
        }
        else
        {
            System.out.println("Element found at"+pos+"in the array");
        }
    }
}

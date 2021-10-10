import java.util.Scanner;

public class mergeSort {
    public static void mergeSort(int arr[],int s,int e)
    {
        if(s>=e)
            return;

        int mid=(s+e)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,e);
    }
    public static void merge(int arr[],int start,int end)
    {
        int mid=(start+end)/2;
        int i=start,j=mid+1,k=0;
        int temp[]=new int[arr.length];
        while(i<=mid && j <=end) {
            if(arr[i] <= arr[j]) {
                temp[k++]=arr[i++];
            }
            else {
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid) {
            temp[k++]=arr[i++];
        }
        while(j<=end) {
            temp[k++]=arr[j++];
        }
        int x=0;
        for(int m=start;m<=end;m++) {
            arr[m]=temp[x++];
        }


    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}

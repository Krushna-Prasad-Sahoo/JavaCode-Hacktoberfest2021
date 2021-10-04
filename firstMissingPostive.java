package com.company;

public class firstMissingPostive {
    public static void main(String[] args) {
        int[] a ={3,4,-1,1};
        System.out.println(first_missing_positive(a));
    }
    static int first_missing_positive(int[]a){

        int i = 0;
        while (i < a.length) {
            int correct = a[i]-1 ;
            if (a[i]>0 && a[i]<=a.length && a[i] != a[correct]) {
                swap(a, i, correct);
            } else {
                i++;
            }
        }
        //serach for first missing number
        for (int index = 0; index < a.length; index++) {
            if (a[index]!=index+1){
                return index+1;
            }
        }
        return a.length+1;

    }
    static void swap(int[] arr,int i,int correct){
        int temp;
        temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}

package org.example.bubblesort;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {12, 234, 1, 90, 345, 54, 12, 88};

        System.out.print("Elements of array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Elements of sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}

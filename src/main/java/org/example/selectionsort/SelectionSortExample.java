package org.example.selectionsort;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] arr = {89, 34, 90, 83, 12, 8, 22, 70, 5, 66};

        System.out.print("Elements of array: ");
        for(int num:arr){
            System.out.print(num+" ");
        }

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
        int temp=arr[minIndex];
        arr[minIndex]=arr[i];
        arr[i]=temp;
        }
        System.out.println();
        System.out.print("Element of sorted array: ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
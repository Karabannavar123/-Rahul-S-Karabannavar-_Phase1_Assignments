/*
    22. Write a program to demonstrate array rotation.
 */

package com.programs.Assignments;

public class ArrayRotation 
{
    void leftRotate(int arr[], int m, int n)
    {
        for (int i=0; i<m; i++)
            leftRotatebyOne(arr, n);
    }

    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i=0; i<n-1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }

    void printArray(int arr[], int n)
    {
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args)
    {
        ArrayRotation rotate = new ArrayRotation();
        int arr[] = { 3, 8, 7, 4, 2, 6, 9 };
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
}

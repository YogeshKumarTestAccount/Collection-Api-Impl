package com.charter.collectionapi.in;

import java.util.Scanner;
public class Insert_Array 
{
    public static void main(String[] args) 
    {
        int n, pos, item;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n+1];
        System.out.println("Size Of Array a[] is:"+a.length);

        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the position where you want to insert element:");
        pos = s.nextInt();
        System.out.print("Enter the element you want to insert:");
        item = s.nextInt();
        for(int i = (n-1); i >= (pos-1); i--)
        {
            a[i+1] = a[i];
        }
        a[pos-1] = item;
        System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);
    }
}
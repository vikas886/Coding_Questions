

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn=new Scanner (System.in);
		int n=scn.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scn.nextInt();
		}
		selection_sort(arr);
		for(int i=0;i<n;i++){
		    System.out.println(arr[i]);
		}
	}
	public static void selection_sort(int[] arr){
	    for(int i=0;i<arr.length-1;i++){
	        int min=i;
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[j]<arr[min]){
	                min=j;
	            }
	        }
	        int temp=arr[min];
	        arr[min]=arr[i];
	        arr[i]=temp;
	    }
	}
}

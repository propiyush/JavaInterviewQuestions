package ArrayProblems;
import java.util.*;
import java.io.*;

// PROBLEM - GIVEN AN ARRAY OF SIZE N, ROTATE IT BY D ELEMENTS

public class RotateArray {
    
    public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[(i+n-d)%n] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}	
		System.out.println();
		t--;
		}
	}
}

/* NOTE - For left rotate (ANTICLOCKWISE)-
arr[i] = arr[(i+D)%N]

For right rotate (CLOCKWISE)-
arr[i] = arr[(i+N-D)%N] */
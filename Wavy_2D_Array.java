package Lec_10;
import java.util.*;
import java.util.Scanner;

public class Wavy_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][]arr=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			if(j%2==0)
			{
				for(int i=0;i<m;i++)
					System.out.print(arr[i][j]+" ");
			}
			else
			{
				for(int i=m-1;i>=0;i--)
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

package com.training.java.basics;

public class Assignment1 {

	public static void main(String[] args) 
	{
		int n=5;
//		for i
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
		System.out.print("  ");
//		for n
		
		
		
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==n/4&&j!=(n-1)/2&&j!=(3*n)/4||i==(n-1)/2&&j!=n/4&&j!=(3*n)/4||i==(3*n)/4&&j!=n/4&&j!=(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
		
		System.out.print("  ");
		
//		for e
		
		for(int j=0;j<n;j++)
		{
			if(j==0||i==0||i==(n-1)/2||i==(n-1))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		
//		for u
		
		for(int j=0;j<n;j++)
		{
			if(j==0 && i!=(n-1)||j==(n-1) && i!=(n-1)||i==(n-1) && j!=0 && j!=(n-1))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		
//		for r
		
		for(int j=0;j<n;j++)
		{
			if(j==0||i==0&&j!=(n-1)||j==(n-1)&&i!=(n-1)/2&&i!=0||i==(n-1)/2&&j!=n-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		
//		for o
		
		for(int j=0;j<n;j++)
		{
			if(j==0&&i!=(n-1)&&i!=0||j==(n-1)&&i!=(n-1)&&i!=0||i==(n-1)&&j!=0&&j!=(n-1)||i==0&&j!=0&&j!=(n-1))
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		
//		for n
		
		for(int j=0;j<n;j++)
		{
			if(j==0||j==n-1||i==n/4&&j!=(n-1)/2&&j!=(3*n)/4||i==(n-1)/2&&j!=n/4&&j!=(3*n)/4||i==(3*n)/4&&j!=n/4&&j!=(n-1)/2)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		
	
	System.out.print("  ");
	System.out.println();
	}

	}
}

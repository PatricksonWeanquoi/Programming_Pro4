package com.programming.switchStatement;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int count=0;
		double sum=0;
		// TODO Auto-generated method stub
		try
		{
		for(int i=1;i<=5;i++)
		{
			System.out.println("What is your grades?");
			double student=scan.nextDouble();
			count++;
			
			if(student==-1)
			{
				
				System.out.println("Your number is less than 0.");
				break;
			}
			if(student<=50)
			{
				System.out.println("aww you scored bad!");
				System.out.println("we will not count that!");
				continue;
			}
			sum=sum+student;
		}}
			catch(Exception x)
			{
				System.out.println("Please use letters.");
				
			}
		
		double average =sum/5;
		System.out.println("average of Students: "+average);
		scan.close();
		
		
		for(int x=1;x<=10;x++)
		{
			
			for(int x2=0;x2<x;x2++)
			{
				System.out.print("*");
				
				
			}
			System.out.println("");
			
		}
	}

}

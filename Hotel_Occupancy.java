/**
 * @author Patrickson Weanquoi
 * @version April 18, 2016
 * 
 * Finds the Occupancy rate of a hotel
 */
package com.programming.LastProject;
import java.text.DecimalFormat;			
import java.util.Scanner;

public class Hotel_Occupancy
{
	private Scanner scan=new Scanner(System.in);	//created an object of the Scanner Class
	private DecimalFormat format=new DecimalFormat("##.##");		//used to format the Occupancy rate 
	
	private int amountFloors;		//number of of floor in hotel
	private int numberRooms;		//number of rooms on each floor
	private int roomOccupied;		//number of rooms occupied in each floor
	private int roomSum=0;			//total rooms in hotel
	private int roomOccupiedSum=0;	//total rooms occupied in hotel
	private int vacant;		//rooms that are vacant
	
	private double OccupancyRate;	//total room occupied divided by total room in hotel
	
	//constructor for Hotel_Occupany class
	public Hotel_Occupancy()
	{
		numberFloors();		//method
		loopOnFloors();		//method
		contentDisplay();	//method
	}	
	public static void main(String[] args)
	{
		new Hotel_Occupancy();
	}
	//Asks user for number of floors in hotel
	public void numberFloors()
	{
		System.out.println("How many floors does the Hotel have?");
		amountFloors=scan.nextInt();
		while(amountFloors<1)
		{
			System.out.println("Sorry, hotels does not have "+amountFloors+ " floors. Please try again.");
			System.out.println("How many floors does the Hotel have?");
			amountFloors=scan.nextInt();
		}		
	}
	//Loops through the floors specified my user
	public void loopOnFloors()
	{
		for(int i=1;i<=amountFloors;i++)
		{
			System.out.println("How many rooms are on floor "+i);
			numberRooms=scan.nextInt();
			//loops to see if number of room on floor is less than minimum rooms required
			while(numberRooms<10)
			{
				System.out.println("Rooms cannot be below 10 in this hotel. Please try again. "+"\nHow many rooms are on floor "+i);
				numberRooms=scan.nextInt();
			}
			System.out.println("How many room(s) is/are occupied?");
			roomOccupied=scan.nextInt();
			//loops to see if number of room occupied on floor is  greater than rooms specified by user
			while(roomOccupied>numberRooms || roomOccupied<0 )
			{
				System.out.println("Sorry, hotel only have "+numberRooms+" rooms. Try again");
				System.out.println("How many room(s) is/are occupied?");
				roomOccupied=scan.nextInt();
			}
			roomSum+=numberRooms;
			roomOccupiedSum+=roomOccupied;		
		}
	}
	//finds number of rooms empty
	public void setVacant()
	{
		vacant=roomSum-roomOccupiedSum;
	}
	//gets value of room vacant
	public int getVacant()
	{
		return vacant;
	}
	//displays the occupancy rate of hotel
	public void contentDisplay()
	{
		System.out.println("\n****************Results*********************\n");
		System.out.println("The number of rooms in the hotel is: "+roomSum);
		System.out.println("Number of rooms occupied are: "+roomOccupiedSum);
		setVacant();
		System.out.println("Number of room vacant are: "+getVacant());
		setOccupancyRate();
		System.out.println("The Occupancy Rate for the hotel is: "+format.format(getOccupancyRate()));
		System.out.println("\n*****************Ends***********************");
	}
	//finds the occupancy rate of hotel
	public void setOccupancyRate()
	{
		OccupancyRate=(float)roomOccupiedSum/roomSum;
	}
	//gets the occupancy rate of hotel
	public double getOccupancyRate()
	{
		return OccupancyRate;
	}
}

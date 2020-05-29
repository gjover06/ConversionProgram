/**
Author:George Samu
Date:5/24/2020
Purpose: Chapter 3 number 5
Write a program to convert a measurement given by the user in yards
feet and inches into an equivalent measurement in meters and centimeters
One yard is 3 feet,one foot is 12 inches, one inch is 2.54 and 
one meter is 100 centimeters.

*/

import java.util.Scanner;

public class ConversionProgram
{
	public static void main (String[]args)
	{
	//notify the user
	System.out.println(" The following program will convert" +
					" a measurement");
	System.out.println();
	
	//create scanner to collect the data
	Scanner keyboard = new Scanner(System.in);
	System.out.println("How many yards in measurement: ");
	double yards = keyboard.nextDouble();
	
	System.out.println("How many feet in measurement: ");
	double feet= keyboard.nextDouble();
	
	System.out.println("How many inches is the measurement: ");
	double inches= keyboard.nextDouble();
		
	//calculate and convert measurement
	
	//example (50yard)*(3feet/1 yd)*(12inches/1 ft)* (2.54 cm/1 in)
	double centimeterFromYards= yards * (3) * (12) * (2.54);
	
	//ex (50yard)*(3feet/1 yd)*(12inches/1 ft)* (2.54 cm/1 in)*(1meter/100cm)
	double metersFromYards= yards * (3) * (12) * (2.54) * (1/100);
	
	//ex 50 feet * (12inches/1 ft) * (2.54 cm/1 in)
	double centimeterFromFeet = feet * (12) * (2.54);
	
	//50 feet * (12inches/1 ft)* (2.54 cm/1 in)*(1meter/100cm)
	double metersFromFeet = feet * (12) * (2.54) * (1/100);
	
	//50 Inches * (2.54 cm/1 in)
	double centimeterFromInches= inches * (2.54);
	
	//50 inches * (2.54 cm/1 in)*(1meter/100cm)
	double metersFromInches= inches * (2.54)*(1/100);
	
	//Print results on Screen
	System.out.println( yards +" yards is converted to " + centimeterFromYards + " cm");
	System.out.println( yards +" yards is converted to " + metersFromYards +" meters");
	System.out.println( feet +" feet is converted to " + centimeterFromFeet + " cm");
	System.out.println( feet +" feet is converted to " + metersFromFeet + " meters");
	System.out.println( inches +" inches is converted to " + centimeterFromInches + " cm");
	System.out.println( inches +" inches is converted to " + metersFromInches + " cm");

	
	}//end main
	
}// end ConvertingLength
	
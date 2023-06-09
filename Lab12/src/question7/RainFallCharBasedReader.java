package question7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * This class read the daily rainfall readings from selected station from a certain source file
 * using suitable subclasses of Reader.
 * 
 * This class is recreated based on RainFallReader.java in package exercise 5
 * 
 * In this case, BufferedReader is used.
 * @author Umairah Hamir-B032120052
 */

public class RainFallCharBasedReader {
	
	public static void main (String [] args)
	{
		//Output file 
		String sourceFile = "RainfallChar.txt";
		
		//Display the sentence for reading data
		System.out.println("Reading data from " + sourceFile + "\n");
		try
		{
			
			
			//Construct the Reader object
			BufferedReader brInput = new BufferedReader(new FileReader(sourceFile));
			
			//Read values from the stream(variables to handle data read from the source file)
			
			//receive daily rainfall reading
			String dailyRainFall = "";
			
			//variables to count number of daily reading in the source file
			int numOfRecords = 0;
			
			//variable to calculate total daily rainfall
			double totalRainFall = 0.0;
			
			// Read values from the stream
			
			
			//Read the data
			dailyRainFall = brInput.readLine();
			while (dailyRainFall != null) {
				
				// Display each daily rainfall reading
				System.out.println(dailyRainFall);
				
				// Calculate total daily rainfall
				totalRainFall = totalRainFall + Double.parseDouble(dailyRainFall);
				
				// Auto update current number of records read from the source file
				numOfRecords ++;
				
				// Read next value for the daily rainfall reading
				dailyRainFall = brInput.readLine();
			}
			
			//Display total number of records for the daily rainffall readings from the source file
			System.out.println("\nTotal Records: " + numOfRecords);
			
			// Display total daily rainfall
			System.out.println("Total Daily Rainfall: " + totalRainFall);
			
			// Calculate average daily rainfall
			double averageRainFall = totalRainFall / Double.valueOf(numOfRecords);
			
			
			String formattedAverage = String.format("%.1f", averageRainFall);
			System.out.print("\nAverage rainfall for " + numOfRecords 
					+ " days from station Simpang Ampat in Alor Gajah district: " + formattedAverage);
						
			//Close the Reader
			brInput.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
					
	}

}

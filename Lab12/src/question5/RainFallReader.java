package question5;

import java.io.DataInputStream;
import java.io.FileInputStream;

/*
 * Lab 12
 * Exercise 5-Processing Daily Rainfall Data A Station
 * 
 * Task D
 * 
 * Data represents for 6 days reading of daily rainfall
 * from station Simpang Ampat in Alor Gajah district
 * and write data output file named "RainFall.txt"
 * with the help of java.io.DataOutputStream.
 * 
 * @author: Umairah Hamir-B032120052
 * 
 */

public class RainFallReader {
	public static void main(String[] args) {
	
		//Output File
		String sFile = "RainFall.txt";
		
		// display the sentence reading data
		System.out.println("Reading data from" + sFile + "\n");
		
		try {

			//Create stream to read data
			DataInputStream disInput = new DataInputStream(new FileInputStream(sFile));
			
			//Read values from the stream(variables to handle data read from the source file)
			
			// receive daily rainfall reading
			double dailyRainFall = 0;
			
			//variables to count number of daily reading in the source file
			int numOfRecord = 0;
			
			//variable to calculate total daily rainfall
			double totalRainFall = 0.0;
			
			//read values from the stream
			dailyRainFall = disInput.read();
			
			System.out.println("The 6 days readings of daily rainfall from station Simpang Ampat in Alor Gajah district from (3/6-8/6): ");
			
			//-1=read until end of file/stream
			while (dailyRainFall != -1) {
				
				//Display each daily rainfall reading
				System.out.println(dailyRainFall);
				
				//Calculate total daily rainfall
				totalRainFall = totalRainFall + dailyRainFall;
				
				//Auto update current number of records read from the source file
				numOfRecord++;
				
				// Read next value for the daily rainfall reading
				dailyRainFall = disInput.read();
	
			} 
			
			//Display total number of records for the daily rainfFall readings from the source file
			System.out.println("\n\nTotal Records: " + numOfRecord);
			
			//Display total daily rainfall that have been reads from source file
			System.out.println("\n\nTotal Daily Rainfall: " + totalRainFall);
			
			//Calculate avg daily rainfall
			double averageRainfall = totalRainFall / Double.valueOf(numOfRecord);
						
			String formatAvg = String.format("%.1f", averageRainfall);
			System.out.print("\nAverage rainfall for " + numOfRecord + " days from station Simpang Ampat in Alor Gajah district: " + formatAvg);
			
			
			//Close stream
			disInput.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		//End of program: Completed
		System.out.println("\n\nEnd of program.");
		

	}

}

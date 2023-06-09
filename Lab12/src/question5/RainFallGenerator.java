package question5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Lab 12
 * Exercise 5-Processing Daily Rainfall Data A Station
 * 
 * Task B
 * Data represents for 6 days reading of daily rainfall
 * from station Simpang Ampat in Alor Gajah district
 * and write data output file named "RainFall.txt"
 * with the help of java.io.DataOutputStream.
 * 
 * @author: Umairah Hamir-B032120052
 * 
 */

public class RainFallGenerator {
	public static void main(String[] args)
	{
		//Output File
		String outFile = "RainFall.txt";
		
		try {

			// Create an output stream between this program and the output file, outFile
			DataOutputStream DataOSOutput = new DataOutputStream(new FileOutputStream(outFile));
			
			// 6 days reading of daily rainfall (from 3 June 2023 to 8 June 2023) from station Simpang Ampat in Alor Gajah district into the output file
			DataOSOutput.write(4);
			DataOSOutput.write(1);
			DataOSOutput.write(0);
			DataOSOutput.write(6);
			DataOSOutput.write(19);
			DataOSOutput.write(1);
			
			//Clear the stream
			DataOSOutput.flush();
			
			//Close the stream
			DataOSOutput.close(); 
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		//End of Program : Completed
		System.out.println("End of program. Check out " + outFile); 

	}

}

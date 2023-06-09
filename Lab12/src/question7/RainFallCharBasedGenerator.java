package question7;

import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 * This class write the daily rainfall readings from selected station to a certain output file
 * using suitable subclasses of Writer.
 * 
 * This class is recreated based on RainFallWriter.java in package exercise 5.
 * 
 * In this case, BufferedWriter is used.
 * @author Umairah Hamir-B032120052
 */
public class RainFallCharBasedGenerator {

	public static void main (String [] args)
	{
		//Identify the destination and output file
		String outFile = "RainFallChar.txt";
		try
		{		
			//Construct BufferedWriter object together with FileWriter
			FileWriter file = new FileWriter(outFile);
			BufferedWriter bwOutput = new BufferedWriter(file);
			int [] array= {4,1,0,6,19,1};
			
			//Write the data
			for (int index = 0; index < array.length; index++) {
				bwOutput.write(String.valueOf(array[index]));
				bwOutput.newLine();
			}
			
			
			//Clear the stream
			bwOutput.flush(); 
			
			//Close the stream
			bwOutput.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}
	
}

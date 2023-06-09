package question6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This program enables Processing  Daily  Rainfall Data from Selected Station using Byte-Based Stream
 * The data is written in byte-based using DataOutputStream class. 
 * 
 * Data:  station id, station name, name of district and 6-days reading of daily rainfall.
 * 
 * @author Umairah Hamir-B032120052
 *
 */

public class RainFallByteBasedGenerator {
	public static void main (String [] args)
	{
		// Output file 
		String outFile = "RainFallByte.txt";
		
		// Data declaration
		// Station id
		int id[] = {2421003, 2322006, 2321006, 2222002, 2424031, 2324032};
		
		// Station name
		String station[] = {"Simpang Ampat", "Melaka Pindah", "Ladang Lendu", "Durian Tunggal", "Datoh Kramat", "Ldg.Sing Lian"};
		
		// district name
		String district[] = {"Alor Gajah", "Alor Gajah", "Alor Gajah", "Alor Gajah", "Jasin      ", "Jasin     "};
		
		// readings on 3 June 2023
		double readings1[] = {4.0, 0.0, 2.0, 0.0, 0.0, 0.0};
		
		// readings on 4 June 2023
		double readings2[] = {1.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		
		// readings on 5 June 2023
		double readings3[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		
		// readings on 6 June 2023
		double readings4[] = {6.0, 2.0, 3.0, 37.0, 0.0, 0.5};
		
		// readings on 7 June 2023
		double readings5[] = {19.0, 18.5, 4.0, 6.0, 17.0, 4.5};
		
		// readings on 8 June 2023
		double readings6[] = {1.0, 2.5, 0.0, 9.0, 0.0, 0.5};
		
		try {
			
			//Create output stream to read data
			DataOutputStream dataOutputStreamOut = new DataOutputStream(new FileOutputStream(outFile));
			
			//Process data
			for (int index = 0; index < station.length; index++) {
				
				//Write data into data stream
				dataOutputStreamOut.writeInt(id[index]);
				dataOutputStreamOut.writeUTF(station[index]);
				dataOutputStreamOut.writeUTF(district[index]);
				dataOutputStreamOut.writeDouble(readings1[index]);
				dataOutputStreamOut.writeDouble(readings2[index]);
				dataOutputStreamOut.writeDouble(readings3[index]);
				dataOutputStreamOut.writeDouble(readings4[index]);
				dataOutputStreamOut.writeDouble(readings5[index]);
				dataOutputStreamOut.writeDouble(readings6[index]);
				
				//Flush for each writing
				dataOutputStreamOut.flush();
			}
			
			//Close stream
			dataOutputStreamOut.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}
	
}

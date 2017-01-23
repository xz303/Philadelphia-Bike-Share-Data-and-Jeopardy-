/**
 * This class is to create a file reader
 * to read input file as well as try-catch exception.
 */
import java.io.File; 
import java.util.ArrayList; 
import java.util.Scanner;

public class FileReader {
	//instance variables.
	private String fileName;
	private ArrayList<String> lines;
	
	//it's a constructor, initialize instance variables.
	public FileReader(String file){
		
		fileName = file;
		lines = new ArrayList<String>();

	}
	/**
	 *  This will read in the entire file.  
	 *  It will store the contents in the lines ArrayList.
	 */
	private void readFile(){
		
		try {
			
			File inputFile = new File(fileName);
			Scanner in = new Scanner(inputFile);
			
			while(in.hasNextLine()){
				String line = in.nextLine();
				lines.add(line);
				
			}
			
			in.close();
			
		}catch(Exception e){
			
			e.printStackTrace();	
		}
		
	}
	/**
	 * The accessor method for lines 
	 * @return the lines arraylist
	 */
	public ArrayList<String> getLines(){
		readFile();
		return lines;
	}
	

}

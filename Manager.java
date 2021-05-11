import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Manager{
	
	  ArrayList<String[]> data; 
	  String [] lineArray = new String[8];

	  
	  public Manager() {
		  data = new ArrayList<String[]>();

	  }
	
	  
	public String LoadMedia()  {
		
		String line="";
		
		
		
		
	try {
		BufferedReader br = new BufferedReader(new FileReader("/Users/nabilhussain/Downloads/idk.csv"));
		try {
			int x = 0;
			 String[] media = new String[4];

			while((line=br.readLine()) != null) {
				
				System.out.println(line);
				lineArray[x]= line.split(",").toString();
				x++;
				
				
				
				 
			}
			
			x=0;
			//return Arrays.deepToString(lineArray);
			
			
			//System.out.println("this is media"+Arrays.deepToString(media));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return Arrays.deepToString(lineArray);

	
	}
	/**
	public String toString() {
		
		return lineArray;
		
		}
		*/
	public static void main(String[] args) {
		Manager m= new Manager();
		m.LoadMedia();
	}
	
}

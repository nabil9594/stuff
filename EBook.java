
import java.util.Calendar;

public class EBook extends Media{
	
	//attributes
	private int numChapters;

	public EBook(int id, String title, int year, int chapters, boolean available) {
		super(id, title, year, available);
		numChapters = chapters;
		}

	
	// get method
	public int getNumChapters() {
		return numChapters;
		}
	// set method
	public void setNumChapters(int numChapters) {
		this.numChapters= numChapters;
	}
	
	
	@Override
	public double calculateRentalFee() {
		double fee= numChapters* 0.10;  
		// basic fee
		int currYear= Calendar.getInstance().get(Calendar.YEAR);
		if(this.getYear() == currYear)fee+= 1;  // add $1.00 fee
		return fee;
		}
	
	@Override
	public String toString() {
	return "EBook [ id="+ getId() + ", title="+ getTitle()
	+ ", year="+ getYear() + ", chapters="+ numChapters+ "is available "+isAvailable()+ "]";
	}
	}


	
	
	
	
	
	
	
	


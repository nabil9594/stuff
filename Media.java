/*
 * 
 * 
 * @author Nabil Hussain
 * 
 * final project
 * 
 * May 06 2021
 * 
 * 
 * 
 * */
public abstract class Media {
	
	// attributes
	private int id;
	private String title;
	private int year;
	private boolean available;

	// validate that 4 digits// constructor
	public Media(int id, String title, int year, boolean available) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.available=available;
	}
	

	// get methods
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;

	}

	public int getYear() {
		return year;

	}

	// set methods
	public void setTitle(String title) {
		this.title = title;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	public boolean isAvailable() {
		return available;
	}
	
	public void setAvailable(boolean available) {
		this.available=available;
	}

	// calculate rental fee; for generic media it is flat fee $3.50
	public double calculateRentalFee() {
		return 3.50;
	}

}
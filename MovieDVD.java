
public class MovieDVD extends Media{
	
	private double size;

	public MovieDVD(int id, String title, int year, double size, boolean available) {
		super(id, title, year, available);
		this.size=size;
	}

	
	//setters and getters
	public double getSize() {
		return size;
	}
	
	public void setSize(double size) {
		this.size=size;
	}
	
	@Override
	public String toString() {
		return"MovieDVD [ id="+ getId() + ", title="+ getTitle() +
				", year="+ getYear() + "is available "+isAvailable()+", size="+ size+ "MB]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

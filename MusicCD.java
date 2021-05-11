import java.util.Calendar;

public class MusicCD extends Media {
	private int length;

	public MusicCD(int id, String title, int year, int length, boolean available) {
		super(id, title, year, available);
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public double calculateRentalFee() {
		double fee = length * 0.02;
		// basic fee
		int currYear = Calendar.getInstance().get(Calendar.YEAR);
		if (this.getYear() == currYear)
			fee += 1; // add $1.00 fee

		return fee;
	}

	@Override
	public String toString() {
		return "MusicCD [id=" + getId() + ", title=" + getTitle() + ", year=" + getYear() + "is available "+isAvailable()+", length=" + length
				+ "min]";
	}

}

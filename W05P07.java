package java_homework;

public class W05P07 {
	public static void main(String[] args) {
		Date07 releaseDate = new Date07();
		releaseDate.year = 1999;
		releaseDate.month = 3;
		releaseDate.day = 31;
		Movie07 movie = new Movie07("매트릭스", "워쇼스키형제", 136, releaseDate);
		System.out.println(movie);
	}
}

class Movie07 {
	String title;
	String directedBy;
	int running;
	Date07 releaseDate;
	
	public Movie07(String title, String directedBy, int running, Date07 releaseDate) {
		this.title = title;
		this.directedBy = directedBy;
		this.running = running;
		this.releaseDate = releaseDate;
	}
	public String toString () {
		return title +"," +directedBy+"," +running +"," + releaseDate;
	}
}

class Date07 {
	int year;
	int month;
	int day;
	
	public String toString() {
		if(month > 10) {
			return year+"-"+month+"-"+day;
		}
		else {	
			return year+"-0"+month+"-"+day;
		}
	}
}

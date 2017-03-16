package java_homework;

public class W05P03 {
	public static void main(String[] args) {
		Movie03 movie = new Movie03("The Matrix", "The Wachowski", 136, "19990331");
		System.out.println(movie);
	}
}

class Movie03 {
	String title;
	String directedBy;
	int running;
	String releaseDate;

	public Movie03(String title, String directedBy, int running, String releaseDate) {
		this.title = title;
		this.directedBy = directedBy;
		this.running = running;
		this.releaseDate = releaseDate;
	}
	
	public String toString () {
		return this.title+"," + this.directedBy+","+this.running +","+this.releaseDate;
	}
}

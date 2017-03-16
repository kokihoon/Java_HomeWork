package java_homework;

public class W05P05 {
	public static void main(String[] args) {
		Movie05 movie = new Movie05("The Matrix:The Wachowski:136:19990331");
		System.out.println(movie);
	}
}

class Movie05 {
	String title;
	String directedBy;
	int running;
	String releaseDate;
	
	public Movie05(String s) {
		String[] s1 = s.split(":");
		this.title = s1[0];
		this.directedBy = s1[1];
		this.running = Integer.parseInt(s1[2]);
		this.releaseDate = s1[3];
	}
	
	
	public String toString () {
		return title +"," +directedBy+"," +running +"," + releaseDate;
	}
}

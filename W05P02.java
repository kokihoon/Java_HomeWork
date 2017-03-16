package java_homework;

public class W05P02 {
	public static void main(String[] args) {
		Movie02 movie = new Movie02("The Matrix", "The Wachowski", 136, "19990331");
		System.out.println(movie.title+"," + movie.directedBy+","+movie.running +","+movie.releaseDate);
	}
}


class Movie02 {
	String title;
	String directedBy;
	int running;
	String releaseDate;
	
	public Movie02(String title, String directedBy, int running, String releaseDate) {
		this.title = title;
		this.directedBy = directedBy;
		this.running = running;
		this.releaseDate = releaseDate;
	}
}
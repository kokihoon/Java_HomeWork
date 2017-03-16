package java_homework;

public class W05P04 {
	public static void main(String[] args) {
		Movie04 movie = new Movie04("The Matrix", "The Wachowski", 136, "19990331");
		System.out.println(movie);
	}
}

class Movie04 {
	String title;
	String directedBy;
	int running;
	String releaseDate;

	public Movie04(String title, String directedBy, int running, String releaseDate) {
		this.title = title;
		this.directedBy = directedBy;
		this.running = running;
		this.releaseDate = releaseDate;
	}
	
	public String toString () {
		return "제목:" + this.title+"\n감독 : " + this.directedBy+"\n상영시간 : "+this.running/60+"시간"+this.running%60+"분\n개봉일 : "+this.releaseDate.substring(0, 4)+"년"+this.releaseDate.substring(4, 6)+"월"+this.releaseDate.substring(6)+"일";
	}
}

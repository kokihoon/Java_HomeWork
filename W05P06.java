package java_homework;

public class W05P06 {
	public static void main(String[] s) {
		Movie06[] movies = new Movie06[6];
		movies[0] = new Movie06("매트릭스","The Wachowski",136,"19990331");
		movies[1] = new Movie06("아바타","The Wachowski",161,"20091210");
		movies[2] = new Movie06("인셉션","The Wachowski",148,"20100708");
		movies[3] = new Movie06("소스코드","The Wachowski",93,"20110311");
		movies[4] = new Movie06("13층","The Wachowski",100,"19990416");
		movies[5] = new Movie06(s[0],s[1],Integer.parseInt(s[2]),s[3]);
		printMovieGuinness(movies);
	}
	public static void printMovieGuinness(Movie06[] movies) {
		Movie06 temp = movies[0];
		
		for(int i = 0; i < movies.length; i++) {
			if(Integer.parseInt(temp.releaseDate.substring(4, 6)) < Integer.parseInt(movies[i].releaseDate.substring(4, 6))) {
				temp = movies[i];
			}
		}
		System.out.println("연중 최후 개봉 영화 : "+temp);
		for(int i = 0; i < movies.length; i++) {
			if(temp.running < movies[i].running) {
				temp = movies[i];
			}
		}
		System.out.println("최장 시간 상영 영화 : "+temp);

		for(int i = 0; i < movies.length; i++) {
			if(temp.running > movies[i].running) {
				temp = movies[i];
			}
	
		}
		System.out.println("최소 시간 상영 영화 : "+ temp);

	}
}

class Movie06 {
	String title;
	String directedBy;
	int running;
	String releaseDate;
	
	public Movie06(String title, String directedBy, int running, String releaseDate) {
		this.title = title;
		this.directedBy = directedBy;
		this.running = running;
		this.releaseDate = releaseDate;
	}
	public String toString () {
		return title +"," +directedBy+"," +running +"," + releaseDate;
	}
}

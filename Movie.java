
public class Movie {
	
	private String name;
	private int YearRealeased;
	private String director;
	
	public Movie() {
		name = "";
		YearRealeased = 1890;
		director = "";
	}
	
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String newDirector) {
		director =newDirector;
	}
	
	public void setYearRealeased(int newYearRealeased) {
		if(newYearRealeased >=1890) {
			YearRealeased = newYearRealeased;
		}
	}
	
	public int getYearReleased() {
		return YearRealeased;
	}
	
	public boolean equals(Movie otherMovie) {
		boolean isEqual = false;
		if(this.name.equals(otherMovie.name) && 
				(this.YearRealeased == otherMovie.YearRealeased)&&this.director.equals(otherMovie.director)) {
			isEqual = true;
		}
		
		return isEqual;
	}
	
	
	
	
}

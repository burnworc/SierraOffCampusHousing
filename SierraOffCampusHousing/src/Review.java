
public class Review {
	private String reviews;
	private int rating;
	private String user;
	
	public Review(String reviews, int rating, String user) {
		this.reviews = reviews;
		this.rating = rating;
		this.user = user;
	}
	
	protected String getReview() {
		return reviews;
	}
	
	protected int getRating() {
		return rating;
	}
	
	protected String getUser() {
		return user;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setUser(String user) {
		this.user = user;
	}
}

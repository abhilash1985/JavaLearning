// ComparableExample.java

// package comparable_comparator_demo.ComparableExampleMain;

public class ComparableExample implements Comparable<ComparableExample> {
	private Integer busId;
	private String busName;
	private Double fare;
	private Double ratings;

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public Double getRatings() {
		return ratings;
	}

	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}

	@Override // Annotation to Override
	public String toString() {
		return "Bus [busId=" + busId + ", busName=" + busName + ", fare=" + fare + ", ratings=" + ratings + "]";
	}

	public ComparableExample(Integer busId, String busName, Double fare, Double ratings) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.fare = fare;
		this.ratings = ratings;
	}

	@Override
	public int compareTo(ComparableExample o) {
		return o.busId.compareTo(this.busId);
	}

	public static void main(String[] args) {
	}
}

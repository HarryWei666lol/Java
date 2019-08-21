package exercises7;

public class BadmintonRacket {
	
	private String name;
	private double weight;
	private double length;
	private int scores;
	
	public BadmintonRacket(String name, double weight, double length, int scores) {
		
		this.name = name;
		this.weight = weight;
		this.length = length;
		this.scores = scores;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getLength() {
		return length;
	}
	
	public void recordScore() {
		this.scores = this.scores + 1;
	}
	
	public int getScores() {
		return scores;
	}
	
	public String toString() {
		return "Racket has recorded " + this.scores + " goals";
	}
	
	

}

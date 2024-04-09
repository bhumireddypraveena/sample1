package task1;

public class JuniorEngineer extends Employee{
	private int assesmentScore;
	private String Feedback;
	
	public JuniorEngineer(int id, String name, int sal, Address address, int assesmentScore, String feedback) {
		super(id, name, sal, address);
		this.assesmentScore = assesmentScore;
		Feedback = feedback;
	}

	public int getAssesmentScore() {
		return assesmentScore;
	}

	public void setAssesmentScore(int assesmentScore) {
		this.assesmentScore = assesmentScore;
	}

	public String getFeedback() {
		return Feedback;
	}

	public void setFeedback(String feedback) {
		Feedback = feedback;
	}

}

package task1;

public class Trainer extends Employee {
	
	private String Skills;
	private String certifications;
	
	public Trainer(int id, String name, int sal, Address address, String skills, String certifications) {
		super(id, name, sal, address);
		Skills = skills;
		this.certifications = certifications;
	}

	public String getSkills() {
		return Skills;
	}

	public void setSkills(String skills) {
		Skills = skills;
	}

	public String getCertifications() {
		return certifications;
	}

	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("TrainerSkills:"+Skills);
		System.out.println("certifications:"+certifications);
}
}

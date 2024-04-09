package task1;

public class SoftwareEngineer extends Employee{
	
	private String ProjectName;

	public SoftwareEngineer(int id, String name, int sal, Address address, String projectName) {
		super(id, name, sal, address);
		ProjectName = projectName;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	
	@Override
	public void printDetails() {
		super.printDetails();
		System.out.println("SoftwareEngineer project:"+ ProjectName);
	}


}

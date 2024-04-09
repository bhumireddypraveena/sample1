package task1;

public class Course {
	private int CourseId;
	private String CourseName;
	private int CourseDuration;
	
	public Course(int courseId, String courseName, int courseDuration) {
		super();
		CourseId = courseId;
		CourseName = courseName;
		CourseDuration = courseDuration;
	}
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getCourseDuration() {
		return CourseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		CourseDuration = courseDuration;
	}
	
	

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CourseModule 
{
	private String moduleName;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Course> courseList = new ArrayList<Course>();
	
	public CourseModule(String moduleName)
	{
		this.moduleName = moduleName;
	}
	
	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	public void addStudent(Student student)
	{
		studentList.add(student);
		
		Collections.sort(studentList, new Comparator<Student>()
		{
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
			
		});
	}
	
	public Student getStudent(String name)
	{
		Student studentFound = null;
		
		if (studentList!= null)
		{	
			for(int i = 0; i < studentList.size(); i++ )
			{
				Student student = studentList.get(i);
				if (student.getName().equals(name)){
					studentFound = student;
				}
				else {
					return null;
				}
			}
		}
		return studentFound;
	}
	
	public void addCourse(Course course)
	{
		courseList.add(course);
		
		Collections.sort(courseList, new Comparator<Course>()
		{
			public int compare(Course c1, Course c2) {
				return c1.getCourseName().compareTo(c2.getCourseName());
			}
			
		});
	}
	
	public Course getCourse(String name)
	{
		Course courseFound = null;
		
		if (courseList!= null)
		{
			for(int i = 0; i < courseList.size(); i++ )
			{
				Course course = courseList.get(i);
				if (course.getCourseName().equals(name)){
					courseFound = course;
				}
				else {
					return null;
				}
			}
		}
		else
		{
			return null;
		}
		return courseFound;
	}
}

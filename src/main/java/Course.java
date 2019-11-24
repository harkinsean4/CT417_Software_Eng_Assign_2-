import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import org.joda.time.DateTime;

public class Course 
{
	private String courseName;
	private ArrayList<CourseModule> modules = new ArrayList<CourseModule>();
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private DateTime academicStartDate;
	private DateTime academicEndDate; 
	
	public Course(String courseName)
	{
		this.setCourseName(courseName);
	}
	
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void setAcademicStartDate(String startDate)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
		
		academicStartDate = new DateTime(LocalDate.parse(startDate, formatter));
	}
	
	public DateTime getAcademicStartDate() {
		return academicStartDate;
	}
	
	public void setAcademicEndDate(String endDate)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
		
		academicEndDate = new DateTime(LocalDate.parse(endDate, formatter));
	}
	
	public DateTime getAcademicEndDate() {
		return academicEndDate;
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
}

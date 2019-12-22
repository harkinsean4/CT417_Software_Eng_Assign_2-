import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

public class CourseTest 
{
	private Course course;
	private String testCourseName;
	private String testStartDate;
	private String testEndDate;

	@Before
	public void setUp() throws Exception 
	{
		testCourseName = "BP101";
		testStartDate = "9-Sep-2019";
		testEndDate = "22-Dec-2019";
		
		course = new Course(testCourseName);
	}

	@Test
	public void testGetCourseName() {
		assertEquals(testCourseName, course.getCourseName());
	}

	@Test
	public void testGetStudent() 
	{
		String studentName = "Sean Harkin";
		String studentUsername = "s.harkin5";
		
		Student student = new Student(studentName, studentUsername);
		
		course.addStudent(student);
		
		assertEquals(student, course.getStudent(studentName));
	}
	
	@Test
	public void getAcademicStartDate()
	{
		DateTime academicStartDate = new DateTime(2019, 9, 29, 0, 0);
		
		course.setAcademicStartDate(2019, 9, 29);
		
		assertEquals(academicStartDate, course.getAcademicStartDate());
	}
	
	@Test
	public void getAcademicEndDate()
	{
		DateTime academicEndDate = new DateTime(2019, 12, 22, 0, 0);
		
		course.setAcademicEndDate(2019, 12, 22);

		assertEquals(academicEndDate, course.getAcademicEndDate());
	}
	
}

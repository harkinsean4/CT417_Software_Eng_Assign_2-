import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CourseTest 
{
	private Course course;
	private String testCourseName;

	@Before
	public void setUp() throws Exception 
	{
		testCourseName = "CT417";
		
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
	
}

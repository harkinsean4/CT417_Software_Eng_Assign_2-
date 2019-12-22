import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;


public class CourseModuleTest {

	private CourseModule courseModule;
	private String moduleName = "CT417";
	
	private Student testStudent;
	private String testName = "Sean Harkin";
	private String testUsername = "s.harkin5";
	
	private Course testCourse;
	private String testCourseName = "BP101";


	@Before
	public void setUp() throws Exception 
	{
		courseModule = new CourseModule(moduleName);
		
		testStudent = new Student(testName, testUsername);
		testCourse = new Course(testCourseName);
	}
	
	@Test
	public void getModuleName() 
	{
		String expectedResult = "CT417_test";
		
		courseModule.setModuleName("CT417_test");
		
		assertEquals(expectedResult, courseModule.getModuleName());
	}
	
	@Test
	public void addStudent() 
	{
		courseModule.addStudent(testStudent);
		
		assertEquals(testStudent, courseModule.getStudent("Sean Harkin"));
	}
	
	@Test
	public void getStudent() 
	{
		courseModule.addStudent(testStudent);
		
		assertEquals(testStudent, courseModule.getStudent("Sean Harkin"));
	}
	
	@Test
	public void addCourse() 
	{
		courseModule.addCourse(testCourse);
		
		assertEquals(testCourse, courseModule.getCourse("BP101"));
	}
	
	@Test
	public void getCourse() 
	{
		courseModule.addCourse(testCourse);
		
		assertEquals(testCourse, courseModule.getCourse("BP101"));
	}

}

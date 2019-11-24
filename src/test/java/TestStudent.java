import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestStudent 
{
	private Student student;
	private String testName = "Sean Harkin";
	private String testUsername = "s.harkin5";
	private String testDOB = "1-Jan-1947";
	private int testAge = 72;
	private int testID = 16316271;

	@Before
	public void setUp() throws Exception 
	{
		student = new Student(testName, testUsername);
		student.setAge(testAge);
		student.setID(testID);
		student.setDob(testDOB);
	}
	
	@Test
	public void getName() 
	{
		String expectedResult = "Patrick Harkin";
		
		student.setName("Patrick Harkin");
		
		assertEquals(expectedResult, student.getName());
	}
	
	@Test
	public void getUsernameTest() 
	{
		String expectedResult = testName + "_" + testUsername;
		
		assertEquals(expectedResult, student.getUsername());
	}
	
	@Test
	public void getDob() 
	{
		LocalDate expectedResult = LocalDate.of(1947, 01, 01);
		
		assertEquals(expectedResult, student.getDob());
	}
	
	@Test
	public void getAge() 
	{
		assertEquals(testAge, student.getAge());
	}
	
	@Test
	public void getID() 
	{
		assertEquals(testID, student.getID());
	}
}
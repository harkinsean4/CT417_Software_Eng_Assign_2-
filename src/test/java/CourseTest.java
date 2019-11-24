import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CourseTest 
{
	private String testCourseName;

	@Before
	public void setUp() throws Exception 
	{
		testCourseName = "CT417";
		
		Course course = new Course(testCourseName);
	}

	@Test
	public void testGetCourseName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStudent() {
		fail("Not yet implemented");
	}

}

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Student //implements java.lang.Comparable<String>
{
	private String name;
	private String username;
	private String dob;
	private LocalDate DOB;
	private int ID;
	private int age;
	
	public Student(String name, String username) 
	{
		this.name = name;
		this.username = username;
	}
	
	public String getUsername()
	{
		username = name + "_" + username;
		
		return username;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		name = newName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return DOB;
	}

	public void setDob(String dob) 
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
		
		DOB = LocalDate.parse(dob, formatter);
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

}

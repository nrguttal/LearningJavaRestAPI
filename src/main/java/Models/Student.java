package Models;

public class Student 
{
	
	private int id;
	private String name;
	private int age;
	private String course;
	
	public Student()
	{
		
	}
	
	//Adding comment to test Git Push
	public Student(int id, String name, int age, String course)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setCourse(String course)
	{
		this.course = course;
	}
	
	
}



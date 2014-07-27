package oop.asg05.Taska;

public class Person
{
	protected	String name;
	protected	Date birthday;

	public Person (String name, Date birthday){
		this.name = name;
		this.birthday = birthday;
	}
	public String getName(){
		return name;
	}
	public String toString(){
		return name + " " + birthday;
	}
}
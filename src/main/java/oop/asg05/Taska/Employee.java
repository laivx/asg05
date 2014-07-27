package oop.asg05.Taska;

public class Employee extends Person
{
	protected	double salary;

	public Employee (String name, Date birthday, double salary){
		super(name, birthday);
		this.salary = salary;
	}
	public void setEmployee(String name, Date birthday, double salary){
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	public String toString(){
		return super.toString() +" "+ salary;
	}
}
package oop.asg05.Taskb;

public class Manager extends Employee
{
	protected Employee assistant;
	
	public Manager (String name, Date birthday, double salary){
		super(name, birthday,salary);
	}
	public void setAssistant(Employee tmp){
		assistant = tmp;
	}
	public String toString(){
		return String.format("%s --- Assistant: %s", super.toString(), assistant.getName());
	}
}
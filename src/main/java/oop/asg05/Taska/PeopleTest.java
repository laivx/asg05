package oop.asg05.Taska;

public class PeopleTest
{
	public static void main(String args[]){
		Employee newbie = new Employee("Newbie", new Date (10,2,1989), 1000000);
		System.out.println(newbie.toString());

		Manager boss = new Manager ("Boss", new Date (23,2,1979),4000000);
		boss.setAssistant(newbie);
		System.out.println(boss.toString());

		Manager bigBoss = new Manager("Big Boss", new Date(3,12,1969), 10000000);
		bigBoss.setAssistant(boss);
		System.out.println(bigBoss.toString());
	}
}
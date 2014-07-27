package oop.asg05.Taskb;

public class PeopleTest
{
	public static void main(String args[]){
		Person [] people  = new Person[3];
		Employee newbie = new Employee("Newbie", new Date (10,2,1989), 1000000);
		Manager boss = new Manager ("Boss", new Date (23,2,1979),4000000);
		boss.setAssistant(newbie);
		Manager bigBoss = new Manager("Big Boss", new Date(3,12,1969), 10000000);
		bigBoss.setAssistant(boss);

		people[0] = newbie; people[1] = boss; people[2] = bigBoss;

		for(int i=0;i<3;i++){
			System.out.println(people[i]);
		}
	}
}
package by.htp.strategy;

public class Main {
	public static void main(String[] args) {
	Human human = new Human();
	
	human.setActivity(new Sleeping());
	human.executeActivity();
	
	human.setActivity(new Eating());
	human.executeActivity();
	
	human.setActivity(new Reading());
	human.executeActivity();
	
	human.setActivity(new Sleeping());
	human.executeActivity();
	
	}
}

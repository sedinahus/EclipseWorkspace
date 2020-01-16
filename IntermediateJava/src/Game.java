import java.util.Scanner;
public class Game {
	private Scanner input;
	private String name; //allows for instance variable to be created
	private int score;
	
	public static void main(String[] agrs) {
		Game g = new Game();
		g.input = new Scanner(System.in);
		g.name = g.getName();
		g.getScore(g.name);
		g.printScore();
	}
	public String getName() {
		System.out.println("enter the game you are playing; ");
		String name = input.nextLine();
		return name;
	}
	public void getScore(String name) {
		System.out.println("please enter the score of " + name);
		score = input.nextInt(); //score is a instance variable
	}
	public void printScore() {
		System.out.println(name + " : " + score);
	}
}

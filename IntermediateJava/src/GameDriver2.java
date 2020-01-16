import java.util.Scanner;
import java.util.Random;

public class GameDriver2 {
	private Random random;
	private Scanner input;
	
	public GameDriver2() {
		input = new Scanner(System.in);
		random = new Random();
	}
	
	public static void main(String[] args) {
		GameDriver2 game = new GameDriver2();
		Player[] players = new Player[2];
		
		for(int i = 0; i < players.length; i++) {
			players[i] = game.getPlayerInfo();
		}

		//we are going to print out infor of each player
		for(int i = 0; i < players.length; i++) {
			System.out.println(players[i]);
			
			while(players[i].getHitPoints() > 0) {
				int damage = 1 + game.random.nextInt(10);
				System.out.println(players[i].takeDamage(damage));
			}
		}
	}
	
	public Player getPlayerInfo(){
		Player player = new Player();
		
		System.out.println("Please enter the character's name: ");
		player.setName(input.nextLine());
		System.out.println("Please enter the class for " + player.getName() + ": ");
		player.setCharClass(input.nextLine());
		System.out.println("Please enter the hit points for " + player.getName() + ": ");
		int hp = input.nextInt();
		player.setHitPoints(hp);
		input.nextLine();
		
		player.setArmor(getPlayerInfo());
		return player;
	}
	
	public Armor getArmorInfo(){
		Armor armor = new Armor();
		
		//type of armor
		System.out.print("Please enter the type for the armor: ");
		String arm = input.nextLine();
		armor.setName(arm);
		
		//armor class
		System.out.println("Please enter the armor class for " + arm);
		int ac = input.nextInt();
		armor.setArmorClass(ac);
		
		//durability
		System.out.println("Please enter the durability for " + arm);
		int durability = input.nextInt();
		armor.setDurability(durability);
		
		String letter = "y";
		
		do {
			System.out.println("Do you want to enter a special property for " + armor.getName() + "? (Y/N");
			String temp = input.nextLine();
			temp = input.nextLine();
			if(temp.equals("y")) {
				System.out.println("Enter a special Property to add to " + armor.getName());
				armor.addSpecialProperties(input.nextLine());
				letter = "y";
			}
			else {
				letter = "n";
				break;
			}
		}
		while (input.equals("y"));
		
		return armor;

		//while(sa != 'N' || sa != 'n'){
			//System.out.println("Please enter the special property for plate mail?");
			//String sp = input.nextLine();
			//addSpecialProperty(sp);
			//System.out.println("Do you want to enter a special property for plate mail (Y/N): ");
			//sa = input.next().charAt(0);
		//}
		
	}
}


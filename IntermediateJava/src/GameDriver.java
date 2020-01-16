
import java.util.Scanner;

public class GameDriver {

	private Scanner input;
	private Object random;

	public static void main(String[] args) {
		GameDriver game = new GameDriver();
		Player player1 = new Player();
		Player player2 = new Player();
		
		Armor arm = new Armor();
		
		Player p1 = game.getPlayerInfo();
		System.out.println(p1);
		game.getArmorInfo(p1);
		
		
		Player p2 = game.getPlayerInfo();
		System.out.println(p2);
		game.getArmorInfo(p2);
		
		if(p1.getHitPoints() > 0){
		            int damage = 1 + ((Scanner) game.random).nextInt(100);
		            System.out.println(p1.takeDamage(damage));
		}

		if(p2.getHitPoints() > 0){
		            int damage = 1 + ((Scanner) game.random).nextInt(100);
		            System.out.println(p1.takeDamage(damage));
		}
		
	}
	
	
	public Player getPlayerInfo(){
		Scanner input = new Scanner(System.in);
		Player player = new Player();
		System.out.println("Please enter the character's name: ");
		player.setName(input.nextLine());
		System.out.println("Please enter the class for " + player.getName() + ": ");
		player.setCharClass(input.nextLine());
		System.out.println("Please enter the hit points for " + player.getName()  + ": ");
		player.setHitPoints(input.nextInt());
		return player;
		
	}
	
	public static void getArmorInfo(Player player){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the type for the armor: ");
		String arm = input.nextLine();
		System.out.println("Please enter the armor class for " + arm + ": ");
		int ac = input.nextInt();
		System.out.println("Please enter the durability for " + arm + ": ");
		int durability = input.nextInt();
		char sa;
		
		do{
			System.out.println("Do you want to enter a special property for " + arm + " (Y/N): ");
			sa = input.next().charAt(0);
			
			if(sa == 'y' || sa == 'Y'){
				System.out.println("Please enter the special property for " + arm + ": ");
				player.arm.addSpecialProperties(input.nextLine());
			}
			
			else{
				break;
			}
		}while(sa == 'y' || sa == 'Y');
		
	}

}//end of class
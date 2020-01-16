/**
 * p.	takeDamage – returns a String.  You should check to see if the player’s armor can take damage.  
 * If the armor can take part of the damage, apply the damage to the armor until the armor reaches 0 then apply damage to the hitPoints.  
 * After applying the damage, if the armor still has durability greater than 0, return the String “You have <points>  points of armor left.”  
 * You should substitute the actual remaining durability for <points>.  If the armor is used up, tell the user how many hitPoints they have remaining.  
 * If the number of hitPoints <= 0, tell the user they are dead.  
 * @author sedina
 *
 */
public class Player extends Armor{
	private String name;
	private String charClass;
	private int hitPoints;
    Armor arm;
	
	
	//constructor of player
	public Player() {
		name = "Fred";
		charClass = "Fighter";
		hitPoints = 100;
	}
	
	//constructor PLayer (name, charClass, hitPoint)
	public Player(String name, String charClass, int hitPoints) {
		this.name = name;
		this.charClass = charClass;
		this.hitPoints = hitPoints;
	}
	
	public Player(String name, String charClass, int hitPoints, Armor arm) {
		this.name = name;
		this.charClass = charClass;
		this.hitPoints = hitPoints;
		this.arm = arm;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getCharClass() {
		return charClass;
	}
	
	public int getHitPoints() {
		return hitPoints;
	}
	
	public Armor getArmor() {
		return arm;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}
	
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public void setArmor(Armor arm) {
		this.arm = arm;
	}

	
	
	//add take damage to check if player can take damage
	public String takeDamage(int damage) {
		String message = "";
		if(arm.getDurability() >= damage) {
			arm.setDurability(arm.getDurability() - damage);
			message = "You have " + arm.getDurability() + " points of armor left.";
			
		}
		else{
			damage = damage - arm.getDurability();
			arm.setDurability(0);
			if(arm.getDurability() == 0) {
				if(damage <= hitPoints) {
					hitPoints = hitPoints - damage;
					message = "You have " + hitPoints + " hit points left.";
				}
				else {
					message = "You are dead!";//result of the game when its over
				}
			}
			
		}
		return message;
	}
}

import java.util.ArrayList;

public class Armor {
	
	private String name;
	private int armorClass;
	private int durability;
	private java.util.ArrayList<String> specialProperties = new ArrayList<String>();
	
	public Armor() {
		name = " ";
		armorClass = 0;
		durability = 0;
	}
	//Armor constructor with name, armorClass, and durability
	public Armor(String name, int armorClass, int durability) {
		this.name = name;
		this.armorClass = armorClass;
		this.durability = durability;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	
	public int getArmorClass() {
		return armorClass;
	}
	
	public int getDurability() {
		return durability;
	}
	public ArrayList getSpecialProperties() {
		return specialProperties;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}
	
	public void setDurability(int durability) {
		this.durability = durability;
	}
	public void addSpecialProperties(String s) {
		specialProperties.add(s);
	}
	
	
	@Override
	public String toString() {
		String s = "";
		
		s = "Armor - type = " + name + "armorClass =  " + armorClass + " durability = " + durability;
		for(int i = 0; i < specialProperties.size(); i++) {
			s += specialProperties.get(i);
		}
		return s;
		
	}
}

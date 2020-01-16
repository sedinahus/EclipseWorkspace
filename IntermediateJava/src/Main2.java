
public class Main2 {
	public static void main(String[] args) {
		Object[] objects = {new Chicken(), new Orange(), new Tiger(), new Cow(), new Fish(), new Peach(), new Raspberry()};
		for(int i = 0; i < objects.length; i++) {
			if(objects[i] instanceof Edible) {
				System.out.println(((Edible)objects[i]).howToEat() );
			}
			if(objects[i] instanceof Animal) {
				System.out.println(  ((Animal)objects[i]).sound());
			}
			if(objects[i] instanceof Juicy) {
				System.out.println(((Juicy)objects[i]).howJuicy());
			}
		}
	}

}
abstract class Animal{
	private double weight;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public abstract String sound();
	
}


class Chicken extends Animal implements Edible, Juicy{
	@Override
	public String howToEat() {
		return "Chicken - grill or fry it";
	}
	@Override
	public String sound() {
		return "Chicken makes sound in english - bawkok";
	}
	@Override
	public String howJuicy() {
		return "On a scale of juciness a chicken is 6/10";
	}
	
}
class Tiger extends Animal implements Edible, Juicy{
	@Override
	public String howToEat() {
		return "We cannot eat tiger but tiger can catch us so becareful.";
	}
	@Override
	public String sound() {
		return "Tiger makes sound in english - roar";
	}
	@Override
	public String howJuicy() {
		return "On a scale of juciness a tiger is 0/10";
	}
}
class Cow extends Animal implements Edible, Juicy{
	@Override
	public String howToEat() {
		return "Cow: grilled steak";
	}
	@Override
	public String sound() {
		return "moooo";
	}
	@Override
	public String howJuicy() {
		return "On a scale of juciness a cow is 8/10";
	}
}
class Fish extends Animal implements Edible, Juicy{
	@Override
	public String howToEat() {
		return "Sushi";
	}
	@Override
	public String sound() {
		return "bubble bubble";
	}
	@Override
	public String howJuicy() {
		return "On a scale of juciness a fish is 10/10";
	}
}
abstract class Fruits implements Edible, Juicy{
	
}
class Orange extends Fruits{
	@Override
	public String howToEat() {
		return "Orange: peel off or make a juice.";
	}
	@Override
	public String howJuicy() {
		return "On a scale of juciness an orange is 10/10";
	}
}
class Peach extends Fruits{
	@Override
	public String howToEat() {
		return "bite the peach or peel it";
	}
	@Override
	public String howJuicy() {
		return "On a scale of juiciness a peach is 3/10";
	}
}
class Raspberry extends Fruits{
	@Override
	public String howToEat() {
		return "wash and eat";
	}
	@Override
	public String howJuicy() {
		return "On a scale of juiciness a raspberry is 1/10";
	}
}

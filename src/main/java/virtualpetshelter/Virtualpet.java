package virtualpetshelter;

public class Virtualpet {

	public String petName;
	public String petType;
	public int petBored;
	public int petFood;
	public int petWater;

	public Virtualpet(String name, String type, int bordem, int hunger, int thirst) {
		petName = name;
		petType = type;
		petBored = bordem;
		petFood = hunger;
		petWater = thirst;
	}

	public Virtualpet(String name, String description) {
		this.petName = name;
		this.petType = description;
		this.petBored = 50;
		this.petFood = 50;
		this.petWater = 50;
	}

		
	public String getPetName() {
		return petName;
	}

	public String getPetType() {
		return petType;
	}

	public int getPetBored() {
		return petBored;
	}

	public int getPetFood() {
		return petFood;
	}

	public int getPetWater() {
		return petWater;
	}

	public void tick() {
		petBored -= 8;
		petFood -= 2;
		petWater -= 2;
	}

	public void play() {
		petBored += 8;
		petWater -= 3;
	}

	public void feed() {
		petFood += 8;
		petWater -= 1;

	}

	public void petWater() {
		petWater += 7;
		
	}
}
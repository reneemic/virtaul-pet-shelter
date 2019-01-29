package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	
		Virtualpet adoptablePet = new Virtualpet(null, null, 0, 0, 0);
		Map<String, Virtualpet> myShelter = new HashMap<String, Virtualpet>();

		public Collection<Virtualpet> availablePets() {
			return myShelter.values();
		}

		public void addPet(Virtualpet adoptablePet) {
			String petsAvailable = adoptablePet.getPetName();
			myShelter.put(petsAvailable, adoptablePet);
		}

		public void removePet(String upForAdoption) {
			myShelter.remove(upForAdoption);
		}

		public void showPets(Virtualpet adoptablePet) {

			for (Entry<String, Virtualpet> entry : myShelter.entrySet()) {
				System.out.println("Name : " + entry.getKey() + " \tType : " + entry.getValue().getPetType()
						+ "\tInterest: " + entry.getValue().getPetBored() + "\tHunger: "
						+ entry.getValue().getPetFood() + "\tThirst: " + entry.getValue().getPetWater());
			}
		}

		public Virtualpet getPetNamed(String name) {
			return myShelter.get(name);
		}

		public void showPetName(Virtualpet adoptablePet) {

			for (Entry<String, Virtualpet> entry : myShelter.entrySet()) {
				System.out.print(entry.getKey() + "\t");
			}
		}

		public void showTypes(Virtualpet adoptablePet) {
			for (Entry<String, Virtualpet> entry : myShelter.entrySet()) {
				System.out.println("Name : " + entry.getKey() + "\tType: " + entry.getValue().getPetType());
			}

		}

		public void callTick(Virtualpet adoptablePet) {

			for (Virtualpet entries : availablePets()) {
				entries.tick();
			}
		}

		public void feedPets(Virtualpet adoptablePet) {
			for (Virtualpet entries : availablePets()) {
				entries.feed();
			}
		}

		public void waterPets(Virtualpet adoptablePet) {
			for (Virtualpet entries : availablePets()) {
				entries.petWater();
			}
		}

		public boolean hasPets() {
			return !myShelter.isEmpty();
		}
	}
	

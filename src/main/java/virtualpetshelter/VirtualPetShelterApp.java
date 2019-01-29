package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Virtualpet pets = new Virtualpet("Kathy", "tabby");
		VirtualPetShelter shelterPets = new VirtualPetShelter();
		shelterPets.addPet(pets);
		Virtualpet oldPet = new Virtualpet("Rita", "beagle");
		shelterPets.addPet(oldPet);
		Virtualpet permanentLab = new Virtualpet("Jeni", "Golden Lab");
		shelterPets.addPet(permanentLab);
		Virtualpet loyalParrot = new Virtualpet("Pauly", "Parrot");
		shelterPets.addPet(loyalParrot);
		System.out.println("Welcome to Liam's Animal Shelter and Sanctuary!");

		String showMenu = "\n\t	What would you like to do with the pets?\n" + "\n\t" + "1. Feed the pets\n\t"
				+ "2. Water the pets\n\t" + "3. Play with a pet\n\t" + "4. Adopt a pet\n\t" + "5. Admit a pet\n\t"
				+ "6. Show all pets.\n\t" + "7. Quit";

		String userChoice;
		while (shelterPets.hasPets()) {
			do {
				System.out.println(showMenu);
				userChoice = input.next();
			} while (!userChoice.equals("1") && !userChoice.equals("2") && !userChoice.equals("3")
					&& !userChoice.equals("4") && !userChoice.equals("5") && !userChoice.equals("6")
					&& !userChoice.equals("7"));
			switch (userChoice) {
			case "1":
				shelterPets.callTick(pets);
				shelterPets.feedPets(pets);
				System.out.println("The shelter pets have polished off the last bit of food.");
				break;
			case "2":
				shelterPets.callTick(pets);
				shelterPets.waterPets(pets);
				System.out.println("The dogs are slobbering, the Kathy is hissing at the water bowl, and Pauly is bathing in it.  They've had enough water");
				break;
			case "3":
				shelterPets.callTick(pets);
				System.out.println("Who would you like to play with?");
				shelterPets.showPetName(pets);
				String chosenPet = input.next();
				Virtualpet playPet = shelterPets.getPetNamed(chosenPet);
				playPet.play();
				System.out.println("You wore" + chosenPet + " out!  It's time for a nap.");
				break;
			case "4":
				shelterPets.callTick(pets);
				shelterPets.showTypes(pets);
				System.out.println("Which pet would you like to adopt?");
				String upForAdoption = input.next();
				shelterPets.removePet(upForAdoption);
				System.out.println("You have a new best friend in " + upForAdoption + " Congrats!");
				break;
			case "5":
				shelterPets.callTick(pets);
				System.out.println("What is your new pets name?");
				String homelessName = input.next();
				System.out.println("What type of pet is it?");
				String homelessType = input.next();
				Virtualpet homelessPet = new Virtualpet(homelessName, homelessType);
				shelterPets.addPet(homelessPet);
				System.out.println("Welcome to Liam's Animal Shelter and Sanctuary, " + homelessName);
				break;
			case "6":
				System.out.println("Here is a list of all the pets we have:");
				shelterPets.showPets(pets);
				break;
			case "7":
				System.out.println("Thank you for volunteering at the Liam's Animal Shelter and Sanctuary.\nGoodbye!");
				System.exit(0);
				break;
			}
		}
		input.close();
	}
}
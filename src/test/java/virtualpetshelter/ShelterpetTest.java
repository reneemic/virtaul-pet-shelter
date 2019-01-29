package virtualpetshelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ShelterpetTest {

	//This test helped me fix my issues with the Virtual Pet I created during my last project 
	//and create the Virtual Pet App
	
	
	//Should Return name and pet type
	@Test
	public void shouldConstructNameAndDescription() {
		Virtualpet underTest = new Virtualpet("name", "description");
		assertNotNull(underTest);
	}

	@Test
	public void shouldReturnVirtualPetName() {
		Virtualpet underTest = new Virtualpet("name", "description");
		String check = underTest.getPetName();
		assertEquals("name", check);
	}

	@Test
	public void shouldReturnVirtualPetDescription() {
		Virtualpet underTest = new Virtualpet("name", "description");
		String check = underTest.getPetType();
		assertEquals("description", check);
	}

	//Tests for returning hungry, bored, and thirst status
	@Test
	public void shouldContstructVirtualPetStatsNameDescriptionHungryWaterBored() {
		Virtualpet underTest = new Virtualpet("name", "description", 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldReturnVirtualPetHungry() {
		Virtualpet underTest = new Virtualpet("name", "description", 1, 0, 0);
		int check = underTest.getPetFood();
		assertEquals(1, check);
	}

	@Test
	public void shouldReturnVirtualPetThirst() {
		Virtualpet underTest = new Virtualpet("name", "description", 0, 1, 0);
		int check = underTest.getPetWater();
		assertEquals(1, check);
	}

	@Test
	public void shouldReturnVirtualPetBored() {
		Virtualpet underTest = new Virtualpet("name", "description", 0, 0, 1);
		int check = underTest.getPetBored();
		assertEquals(1, check);
	}

	@Test
	public void shouldFeedPet() {
		Virtualpet underTest = new Virtualpet("name", "description", 2, 0, 0);
		underTest.getPetFood();
		int check = underTest.getPetFood();
		assertEquals(4, check);
	}

	@Test
	public void shouldWaterPet() {
		Virtualpet underTest = new Virtualpet("name", "description", 0, 2, 0);
		underTest.petWater();
		int check = underTest.getPetWater();
		assertEquals(5, check);
	}

	@Test
	public void shouldPlayWithPet() {
		Virtualpet underTest = new Virtualpet("name", "description", 0, 0, 2);
		underTest.play();
		int check = underTest.getPetBored();
		assertEquals(3, check);
	}

	@Test
	public void shouldTickPet() {
		Virtualpet underTest = new Virtualpet("name", "description", 2, 2, 2);
		underTest.tick();

		int check = underTest.getPetFood();
		int check2 = underTest.getPetWater();
		int check3 = underTest.getPetBored();
		assertEquals(1, check);
		assertEquals(1, check2);
		assertEquals(1, check3);
	}

}
	


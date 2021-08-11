package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import main.Cafe;
import main.Coffee;
import main.CoffeeType;




public class CafeTest {

	public static final int ESPRESSO_BEANS_WEIGHT = 7;
	
	Cafe cafe;
	
	@BeforeEach
	public void setup() {
		cafe = new Cafe();
		System.out.println("before each");
	}
	
	@AfterEach
	public void teardown() {
		System.out.println("after each");
	}
	
	@AfterAll
	public static void end() {
		System.out.println("Test end");
	}
	
	@Test
	public void shouldBrewEspresso() {
		//Given
		cafe.restockBeans(ESPRESSO_BEANS_WEIGHT);
		
		//When 
		Coffee coffee = cafe.brew(CoffeeType.Espresso);
		
		//Then
		assertEquals(ESPRESSO_BEANS_WEIGHT, coffee.getBeans());
		assertEquals(0, coffee.getMilk());
		assertEquals(CoffeeType.Espresso, coffee.getType());
	}
	
	@Test 
	public void shoulUpdateStockLevels(){
		//Given
		cafe.restockBeans(ESPRESSO_BEANS_WEIGHT);
		
		//When
		cafe.brew(CoffeeType.Espresso); 
		
		//Then
		assertEquals( 1, cafe.getBeansInStock(), "I am a diagnostic message here I should say: Does not update the bean stock correctly!");
	}
	
	@Test 
	public void shouldRequireBeensToBrewEspresso() {
		//G
		
		//T -- assert that exception was thrown
		assertThrows(IllegalStateException.class, () -> {
			//W - deliberately not filled to throw an exception 
			cafe.brew(CoffeeType.Espresso);
		});
	}
}

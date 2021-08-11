package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.Cafe;
import main.Coffee;
import main.CoffeeType;

public class CafeTest {

	@Test
	public void shouldBrewEspresso() {
		//Given
		Cafe cafe = new Cafe();
		cafe.restockBeans(7);
		
		//When 
		Coffee coffee = cafe.brew(CoffeeType.Espresso);
		
		//Then
		assertEquals(7, coffee.getBeans());
		assertEquals(0, coffee.getMilk());
		assertEquals(CoffeeType.Espresso, coffee.getType());
	}
	
	@Test 
	public void shoulUpdateStockLevels(){
		//Given
		Cafe cafe = new Cafe();
		cafe.restockBeans(7);
		
		//When
		cafe.brew(CoffeeType.Espresso); 
		
		//Then
		assertEquals(0, cafe.getBeansInStock());
	}
	
	@Test 
	public void shouldRequireBeensToBrewEspresso() {
		//G
		Cafe cafe = new Cafe(); 
		
		//T -- assert that exception was thrown
		assertThrows(IllegalStateException.class, () -> {
			//W - deliberately not filled to throw an exception 
			cafe.brew(CoffeeType.Espresso);
		});
	}
}

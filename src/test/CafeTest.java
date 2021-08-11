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
		Cafe cafe = new Cafe();
		cafe.restockBeans(7);
		Coffee coffee = cafe.brew(CoffeeType.Espresso);
		
		assertEquals(7, coffee.getBeans());
		assertEquals(0, coffee.getMilk());
		assertEquals(CoffeeType.Espresso, coffee.getType());
	}
}

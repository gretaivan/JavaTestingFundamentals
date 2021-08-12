package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class HamcrestMatcher {

	
	@Test
	public void mapShoulContainVal() {
		var values = Map.of("A", 1, "B", 2);
		
		//check for value b which is not in the map
		//assertTrue(values.containsKey("b")); //but this is not an informative test
		//better practice to use matcher such as hasKey
		assertThat(values, hasKey("b"));
		
	}


}

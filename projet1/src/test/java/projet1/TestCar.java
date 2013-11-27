package projet1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCar {
	
	Car car;
	
	@Before
	public void init(){
		
		car = new Car();
	}

	@Test
	public void test() {
		
		assertEquals("Polo5", car.getModel() );
		
	}

}

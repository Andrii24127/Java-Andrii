package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import func.Srednia;

public class SredniaTest {
	Srednia s;
	
    @BeforeEach
    void setUp() {
        s =  new Srednia(5, 17);
    }
	
	@Test
	void getSrednia() {
		assertEquals(11, s.getSrednia(), 0); 	
	}
}

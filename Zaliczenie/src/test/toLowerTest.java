package test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import func.toLower;

public class toLowerTest {
	toLower s;
	
    @BeforeEach
    void setUp() {
        s =  new toLower("DADANETNET");
    }
	
	@Test
	void getSrednia() {
		assertEquals("dadanetnet", s.ToLower()); 	
	}
}

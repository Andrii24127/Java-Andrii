package test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import func.RemoveSpace;

public class RemoveSpaceTest {
	RemoveSpace s;
	
    @BeforeEach
    void setUp() {
        s =  new RemoveSpace("ds ad a sd a");
    }
	
	@Test
	void getSrednia() {
		assertEquals("dsadasda", s.RemoveSpace()); 	
	}
}

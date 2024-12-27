package tcs.MavenProject01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    public void testwithpositives() {
    	int excepted =2;
    	  Maths ms=new Maths();
    	  int actualsum = ms.addNumbers(2, 0);
    	  assertEquals(excepted, actualsum);
    }
  
   
}

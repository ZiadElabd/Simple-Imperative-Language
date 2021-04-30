package Unit_Test;


import org.junit.Test;

import Language.Grammer;
import Language.ParseException;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.StringReader;

/**
 *
 * @author Ziad Elabd
 * @author Ziad Albana
 */
public class Test_Essential {	
    
    @Test
    public void test1() throws ParseException  {
    	String test="if tt then a:==5 else skip";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
        assertTrue(Grammer.check(reader));
    }
    
   /* 
    @Test (expected=java.lang.NullPointerException.class)
    public void testDequeue() {
    	
    }
    
    @Test (expected=java.lang.NullPointerException.class)
    public void testFront() {
          
    }*/

    
}
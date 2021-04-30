package Unit_Test;


import org.junit.Test;

import Language.Grammer;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.StringReader;

/**
 *
 * @author Ziad Elabd
 * @author Ziad Albana
 */

public class Test_Complex {	
	
	@Test
    public void test1() {   // valid case
    	String test="a := 5; \n"
    			+ " if tt then a:=5 else skip";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
        assertTrue(Grammer.check(reader));
    }
    
    @Test
    public void test2() {  // invalid case
    	String test="a := 5 \n "
    			+ "if tt then a:=5 else skip";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
        assertFalse(Grammer.check(reader));
    }
    
    @Test
    public void test3() {   // valid case
    	String test=" a := 5; \n "
    			+ "while tt do a:=5;skip";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
        assertTrue(Grammer.check(reader));
    }
    
    @Test
    public void test4() {   // valid case
    	String test=" a := 5;  \n"
    			+ "while ff do a:=5;skip";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
        assertTrue(Grammer.check(reader));
    }
    
    @Test
    public void test5() {   // valid case
    	String test="if tt then a:=5;\n"
    						 + "while ff do a:=5 "
    				+ "else  a:=5";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
        assertTrue(Grammer.check(reader));
    }
    
}
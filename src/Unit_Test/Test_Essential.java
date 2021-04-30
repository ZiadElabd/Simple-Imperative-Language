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
    public void test1() {   // valid case
    	String test="a := 5";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
        assertTrue(Grammer.check(reader));
    }
    
    @Test
    public void test2() {  // valid case
    	String test="tt ^ ff";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
        assertTrue(Grammer.check(reader));
    }
    
    @Test
    public void test3() {   // valid case
    	String test="(5 + 5)";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
        assertTrue(Grammer.check(reader));
    }
    
    @Test
    public void test4() {   // valid case
    	String test="(5 - 5)";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
        assertTrue(Grammer.check(reader));
    }
    
    @Test
    public void test5() {   // valid case
    	String test="if tt then a:=5 else skip";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
        assertTrue(Grammer.check(reader));
    }
    
    @Test
    public void test6() {   // valid case
    	String test="if ff then a:=5 else a:=7";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
        assertTrue(Grammer.check(reader));
    }
    
    @Test
    public void test7() {   // invalid case
    	String test="if true then a:=5 else skip";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
        assertFalse(Grammer.check(reader));
    }
    
    @Test
    public void test8() {   // invalid case
    	String test="if false then a:=5 else skip";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
    	assertFalse(Grammer.check(reader));
    }
    
    @Test
    public void test9() {   // invalid case
    	String test="if tt then a:==5 else skip";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
    	assertFalse(Grammer.check(reader));
    }
    
    @Test
    public void test10() {   // invalid case
    	String test="if tt then a:=5 else skip;";
    	BufferedReader reader = new BufferedReader(new StringReader(test));
    	assertFalse(Grammer.check(reader));
    }
}
package com.iutblagnac.r303trace;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Test the return with empty parameter
     */
    public void testHelloEmptyParameter()
    {
        assertEquals("Hello World!", App.hello());
    }

    /**
     * Test the return with a parameter
     */
    public void testHelloParameter()
    {
        assertEquals("Hello xX_DarkLord5866Xx!", App.hello("Hello xX_DarkLord5866Xx!"));
    }

     /**
     * Test the return with empty parameter
     */
    public void testGoodbyeEmptyParameter()
    {
        assertEquals("See you World !", App.goodbye());
    }

    /**
     * Test the return with a parameter
     */
    public void testGoodbyeParameter()
    {
        assertEquals("Goodbye xX_DarkLord5866Xx !", App.goodbye("Goodbye xX_DarkLord5866Xx !"));
    }

}

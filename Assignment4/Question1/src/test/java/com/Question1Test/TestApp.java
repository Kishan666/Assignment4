package com.Question1Test;

/**
 * Created by Kishan on 2017-03-30.
 */
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class TestApp extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestApp( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestApp.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Lázaro <lalazaro@keedio.com>
 */
public class SourceUtilTest {
    
    public SourceUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFolder method, of class SourceUtil.
     */
    @Test
    public void testGetFolder() {
        System.out.println("getFolder");
        SourceUtil instance = new SourceUtil();
        String expResult = "/Users/luislazaro/Documents";
        instance.setFolder(expResult);
        String result = instance.getFolder();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFolder method, of class SourceUtil.
     */
    @Test
    public void testSetFolder() {
        System.out.println("setFolder");
        String folder = "/Users/luislazaro/Documents";
        SourceUtil instance = new SourceUtil();
        instance.setFolder(folder);
    }

    /**
     * Test of getRunDiscoverDelay method, of class SourceUtil.
     */
    @Test
    public void testGetRunDiscoverDelay() {
        System.out.println("getRunDiscoverDelay");
        SourceUtil instance = new SourceUtil();
        int expResult = 10000;
        instance.setRunDiscoverDelay(expResult);
        int result = instance.getRunDiscoverDelay();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRunDiscoverDelay method, of class SourceUtil.
     */
    @Test
    public void testSetRunDiscoverDelay() {
        System.out.println("setRunDiscoverDelay");
        int runDiscoverDelay = 0;
        SourceUtil instance = new SourceUtil();
        instance.setRunDiscoverDelay(runDiscoverDelay);
    }
    
}

/*
 * Copyright (C) 2015 Luis Lázaro <lalazaro@keedio.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.apache.flume.source;

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
public class SourceUtilsTest {
    
    public SourceUtilsTest() {
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
     * Test of getFolder method, of class SourceUtils.
     */
    @Test
    public void testGetFolder() {
        System.out.println("getFolder");
        SourceUtils instance = new SourceUtils();
        String expResult = "/Users/luislazaro/Documents";
       instance.setFolder(expResult);
        String result = instance.getFolder();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRunDiscoverDelay method, of class SourceUtils.
     */
    @Test
    public void testGetRunDiscoverDelay() {
        System.out.println("getRunDiscoverDelay");
        SourceUtils instance = new SourceUtils();
        int expResult = 10000;
        instance.setRunDiscoverDelay(expResult);
        int result = instance.getRunDiscoverDelay();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFolder method, of class SourceUtils.
     */
    @Test
    public void testSetFolder() {
        System.out.println("setFolder");
        String folder = "";
        SourceUtils instance = new SourceUtils();
        instance.setFolder(folder);
    }

    /**
     * Test of setRunDiscoverDelay method, of class SourceUtils.
     */
    @Test
    public void testSetRunDiscoverDelay() {
        System.out.println("setRunDiscoverDelay");
        int runDiscoverDelay = 0;
        SourceUtils instance = new SourceUtils();
        instance.setRunDiscoverDelay(runDiscoverDelay);
    }
    
}

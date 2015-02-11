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

import java.io.File;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.flume.Context;
import org.apache.flume.PollableSource;
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
public class DirectorySourceTest {
    
    public DirectorySourceTest() {
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
     * Test of configure method, of class DirectorySource.
     */
    @Test
    public void testConfigure() {
        System.out.println("configure");
        Context context = null;
        DirectorySource instance = new DirectorySource();
        instance.configure(context);
    }

    /**
     * Test of process method, of class DirectorySource.
     */
    @Test
    public void testProcess() throws Exception {
        System.out.println("process");
        DirectorySource instance = new DirectorySource();
        PollableSource.Status expResult = null;
        PollableSource.Status result = instance.process();
        assertEquals(expResult, result);
    }

    /**
     * Test of start method, of class DirectorySource.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Context context = null;
        DirectorySource instance = new DirectorySource();
        instance.start(context);
    }

    /**
     * Test of stop method, of class DirectorySource.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        DirectorySource instance = new DirectorySource();
        instance.stop();
    }

    /**
     * Test of processMessage method, of class DirectorySource.
     */
    @Test
    public void testProcessMessage() {
        System.out.println("processMessage");
        byte[] lastInfo = null;
        DirectorySource instance = new DirectorySource();
        instance.processMessage(lastInfo);
    }

    /**
     * Test of discoverElements method, of class DirectorySource.
     */
    @Test
    public void testDiscoverElements() {
        System.out.println("discoverElements");
        DirectorySource instance = new DirectorySource();
        instance.discoverElements();
    }

    /**
     * Test of cleanList method, of class DirectorySource.
     */
    @Test
    public void testCleanList() {
        System.out.println("cleanList");
        HashMap<File, Long> map = null;
        DirectorySource instance = new DirectorySource();
        instance.cleanList(map);
    }

    /**
     * Test of cleanListMirror method, of class DirectorySource.
     */
    @Test
    public void testCleanListMirror() {
        System.out.println("cleanListMirror");
        HashMap<File, Long> map = null;
        DirectorySource instance = new DirectorySource();
        instance.cleanListMirror(map);
    }

    /**
     * Test of saveMap method, of class DirectorySource.
     */
    @Test
    public void testSaveMap() {
        System.out.println("saveMap");
        HashMap<File, Long> map = null;
        int num = 0;
        DirectorySource instance = new DirectorySource();
        instance.saveMap(map, num);
       
    }

    /**
     * Test of saveMapB method, of class DirectorySource.
     */
    @Test
    public void testSaveMapB() {
        System.out.println("saveMapB");
        HashMap<File, Boolean> map = null;
        DirectorySource instance = new DirectorySource();
        instance.saveMapB(map);
       
    }

    /**
     * Test of loadMap method, of class DirectorySource.
     */
    @Test
    public void testLoadMap() throws Exception {
        System.out.println("loadMap");
        String name = "";
        DirectorySource instance = new DirectorySource();
        HashMap<File, Long> expResult = null;
        HashMap<File, Long> result = instance.loadMap(name);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of loadMapB method, of class DirectorySource.
     */
    @Test
    public void testLoadMapB() throws Exception {
        System.out.println("loadMapB");
        String name = "";
        DirectorySource instance = new DirectorySource();
        HashMap<File, Boolean> expResult = null;
        HashMap<File, Boolean> result = instance.loadMapB(name);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of ReadFileWithFixedSizeBuffer method, of class DirectorySource.
     */
    @Test
    public void testReadFileWithFixedSizeBuffer_RandomAccessFile() throws Exception {
        System.out.println("ReadFileWithFixedSizeBuffer");
        RandomAccessFile aFile = null;
        DirectorySource instance = new DirectorySource();
        instance.ReadFileWithFixedSizeBuffer(aFile);
        
    }

    /**
     * Test of ReadFileWithFixedSizeBuffer method, of class DirectorySource.
     */
    @Test
    public void testReadFileWithFixedSizeBuffer_RandomAccessFile_File() throws Exception {
        System.out.println("ReadFileWithFixedSizeBuffer");
        RandomAccessFile aFile = null;
        File file = null;
        DirectorySource instance = new DirectorySource();
        instance.ReadFileWithFixedSizeBuffer(aFile, file);
        
    }

    /**
     * Test of closeChannel method, of class DirectorySource.
     */
    @Test
    public void testCloseChannel() {
        System.out.println("closeChannel");
        HashMap<File, Boolean> map = null;
        DirectorySource instance = new DirectorySource();
        instance.closeChannel(map);
       
    }

    /**
     * Test of getSourceUtils method, of class DirectorySource.
     */
    @Test
    public void testGetSourceUtils() {
        System.out.println("getSourceUtils");
        DirectorySource instance = new DirectorySource();
        SourceUtils expResult = null;
        SourceUtils result = instance.getSourceUtils();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setSourceUtils method, of class DirectorySource.
     */
    @Test
    public void testSetSourceUtils() {
        System.out.println("setSourceUtils");
        SourceUtils sourceUtils = null;
        DirectorySource instance = new DirectorySource();
        instance.setSourceUtils(sourceUtils);
        
    }

    /**
     * Test of getSizeFileList method, of class DirectorySource.
     */
    @Test
    public void testGetSizeFileList() {
        System.out.println("getSizeFileList");
        DirectorySource instance = new DirectorySource();
        HashMap<File, Long> expResult = null;
        HashMap<File, Long> result = instance.getSizeFileList();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setSizeFileList method, of class DirectorySource.
     */
    @Test
    public void testSetSizeFileList() {
        System.out.println("setSizeFileList");
        HashMap<File, Long> sizeFileList = null;
        DirectorySource instance = new DirectorySource();
        instance.setSizeFileList(sizeFileList);
       
    }

    /**
     * Test of getMarkFileList method, of class DirectorySource.
     */
    @Test
    public void testGetMarkFileList() {
        System.out.println("getMarkFileList");
        DirectorySource instance = new DirectorySource();
        HashMap<File, Long> expResult = null;
        HashMap<File, Long> result = instance.getMarkFileList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMarkFileList method, of class DirectorySource.
     */
    @Test
    public void testSetMarkFileList() {
        System.out.println("setMarkFileList");
        HashMap<File, Long> markFileList = null;
        DirectorySource instance = new DirectorySource();
        instance.setMarkFileList(markFileList);
        
    }

    /**
     * Test of getChannelList method, of class DirectorySource.
     */
    @Test
    public void testGetChannelList() {
        System.out.println("getChannelList");
        DirectorySource instance = new DirectorySource();
        HashMap<File, Boolean> expResult = null;
        HashMap<File, Boolean> result = instance.getChannelList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setChannelList method, of class DirectorySource.
     */
    @Test
    public void testSetChannelList() {
        System.out.println("setChannelList");
        HashMap<File, Boolean> channelList = null;
        DirectorySource instance = new DirectorySource();
        instance.setChannelList(channelList);
       
    }

    /**
     * Test of getDeletedFiles method, of class DirectorySource.
     */
    @Test
    public void testGetDeletedFiles() {
        System.out.println("getDeletedFiles");
        DirectorySource instance = new DirectorySource();
        HashSet<File> expResult = null;
        HashSet<File> result = instance.getDeletedFiles();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDeletedFiles method, of class DirectorySource.
     */
    @Test
    public void testSetDeletedFiles() {
        System.out.println("setDeletedFiles");
        HashSet<File> deletedFiles = null;
        DirectorySource instance = new DirectorySource();
        instance.setDeletedFiles(deletedFiles);
       
    }

    /**
     * Test of getChunkSize method, of class DirectorySource.
     */
    @Test
    public void testGetChunkSize() {
        System.out.println("getChunkSize");
        DirectorySource instance = new DirectorySource();
        int expResult = 0;
        int result = instance.getChunkSize();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setChunkSize method, of class DirectorySource.
     */
    @Test
    public void testSetChunkSize() {
        System.out.println("setChunkSize");
        int chunkSize = 0;
        DirectorySource instance = new DirectorySource();
        instance.setChunkSize(chunkSize);
       
    }
    
}

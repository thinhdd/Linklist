package com.qsoft;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 7/24/13
 * Time: 1:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class testSingleLinkList
{
    List<Model> list= new ArrayList<Model>();
    @Before
    public void setUp()
    {
        list.add(new Model("thinh"));
        list.add(new Model("dao"));
    }
    @Test
    public void testListEmpty()
    {
        SingleLinkList singleLinkList = new SingleLinkList();
        assertTrue(singleLinkList.getSize()==0);
    }
    @Test
    public void testCreateListFromArrayObject()
    {
        SingleLinkList singleLinkList = new SingleLinkList(list);
        assertTrue(singleLinkList.getSize()==2);
    }
    @Test
    public void testFindNode()
    {
        SingleLinkList singleLinkList = new SingleLinkList(list);
        assertEquals("thinh", singleLinkList.find(0).getName());
    }
    @Test
    public void testAddNodeToLocationN()
    {
        SingleLinkList singleLinkList = new SingleLinkList(list);
        Model model = new Model("duc");
        singleLinkList.add(model, 1);
        assertEquals(model, singleLinkList.find(1));
        assertTrue(singleLinkList.getSize()==3);
    }


}

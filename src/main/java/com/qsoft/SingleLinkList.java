package com.qsoft;

import java.util.List;
import java.util.ArrayList;
/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 7/24/13
 * Time: 1:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class SingleLinkList
{
    List<Model> modelList = new ArrayList<Model>();

    public SingleLinkList()
    {
    }

    public SingleLinkList(List<Model> modelList)
    {
        this.modelList = modelList;
    }
    public int getSize()
    {
        return modelList.size();
    }

    public void add(Model model, int index)
    {
        modelList.add(index, model);
    }

    public Model find(int index)
    {

        return modelList.get(index);
    }
}

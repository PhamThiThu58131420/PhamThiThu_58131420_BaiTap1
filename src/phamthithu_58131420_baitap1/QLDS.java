/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phamthithu_58131420_baitap1;

import java.util.ArrayList;

/**
 *
 * @author phamthu
 */
public class QLDS implements IQLDS
{
    ArrayList<CaNhan> caNhan =  new ArrayList();    

    @Override
    public int them(CaNhan p) 
    {
         caNhan.add(p);
        return caNhan.size();
    }

    @Override
    public int xoa(String ten) 
    {

    }

    @Override
    public void inDS() 
    {
        
    }
}

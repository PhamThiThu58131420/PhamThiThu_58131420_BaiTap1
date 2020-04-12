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
public class LopHoc
{
    ArrayList<HocSinh> hocSinh = new ArrayList<>();
    ArrayList<GiaoVien> giaoVien = new ArrayList<>();
    ArrayList<QLDS> qlds = new ArrayList<>();
   
    
    public int themHocSinh(HocSinh hs)
    {
        hocSinh.add(hs);
        return hocSinh.size();
    }
    public int themGVGD(GiaoVien gv)
    {
        giaoVien.add(gv);
        return giaoVien.size();
    }
    public int inDSHS()
    {
        
    }
    public int inDSGVGD()
    {
        
    }
    
    
}

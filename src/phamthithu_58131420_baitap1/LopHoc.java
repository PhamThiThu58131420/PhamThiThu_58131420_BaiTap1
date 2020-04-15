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
        for(int i=0; i<hocSinh.size();i++)
        {
            System.out.println("---------------");
            System.out.println("Danh Sách học  sinh"+"\n" + hocSinh.get(i).HienThiTT()
                  +hocSinh.get(i).getLop()+"\n"
                  +hocSinh.get(i).getNangKhieu());
            System.out.println("----------||||-------------");
        }
        return 0;
    }
    public int inDSGVGD()
    {
         for(int i=0; i<giaoVien.size();i++)
        {
            System.out.println("---------------");
            System.out.println("Danh Sách giáo viên " +"\n" + giaoVien.get(i).HienThiTT()
                 +giaoVien.get(i).getMonDay()+"\n"
                 +giaoVien.get(i).getToBoMon());
            System.out.println("----------|||||----------");
        }
        return 0;
    }
    
    
}

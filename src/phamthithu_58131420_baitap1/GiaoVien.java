/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phamthithu_58131420_baitap1;

/**
 *
 * @author phamthu
 */
public class GiaoVien extends CaNhan
{
    String monDay;
    String toBoMon;

    public GiaoVien() {
    }

    
    public GiaoVien(String monDay, String toBoMon) {
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT(); 
    }
    
}

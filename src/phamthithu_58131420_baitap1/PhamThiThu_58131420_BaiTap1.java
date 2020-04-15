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
public class PhamThiThu_58131420_BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // tạo học sinh
        HocSinh hocSinh = new HocSinh("CNTT", "hát", "phạm thị thu", 22, "nha trang", "012342");
        HocSinh hocSinh1 = new HocSinh("DU LỊCH", "nhảy", "nguyễn hồng thuận", 25, "hà nội", "0122276");
        HocSinh hocSinh2 = new HocSinh("CƠ KHÍ", "chơi game", "mai xuân vũ", 23, "đà nẳng", "0123629");
        HocSinh hocSinh4 = new HocSinh("CNTT", "hát", "phạm thu trang", 22, "nha trang", "012342");
        //tạo giáo viên
       GiaoVien giaoVien = new GiaoVien("mẫu thiết kế", "kỹ thuật phần mềm", "huỳnh tuấn anh", 40, "nha trang", "028272");
       GiaoVien giaoVien1 = new GiaoVien("toán du lịch", "kỹ thuật", "nguyễn anh đạt", 30, "tphcm", "00288272");
       GiaoVien giaoVien2 = new GiaoVien("toán cơ khí", "kỹ thuật cở kí", "lê văn anh", 46, "nha trang", "0239272");
         
       
         LopHoc lopHoc = new LopHoc();
           //them học sinh
         lopHoc.themHocSinh(hocSinh);
         lopHoc.themHocSinh(hocSinh1);
         lopHoc.themHocSinh(hocSinh2);
         lopHoc.themHocSinh(hocSinh4);
         
         //thêm giáo viên
         lopHoc.themGVGD(giaoVien);
         lopHoc.themGVGD(giaoVien1);
         lopHoc.themGVGD(giaoVien2);
         // in danh sách học sinh
         System.out.println("danh sách học sinh : "+"\n"+ lopHoc.inDSHS());
         // in danh sách giáo viên 
         System.out.println("danh sách giáo viên: " +"\n"+lopHoc.inDSGVGD());
         
         
         
         
    }
    
}

package Menu;

import java.util.ArrayList;
import KieuDL.NhanVien;
import static Menu.XuatNhapSua.menuNhap;
import static Menu.XuatNhapSua.menuSua;
import static Menu.XuatNhapSua.menuXuat;
import static NhapXuatDS.XuatDS.xuat5CaoNhat;
import static SapXep.SapXep.sapXepTen;
import static SapXep.SapXep.sapXepThuNhap;
import static SuaXoa.Xoa.xoaTheoMa;
import static Nhap.BanPhim.nhapINT;
import static Nhap.BanPhim.nhapSTRING;

public class MenuChon {
    static ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
    public static void bangMenu(){
        System.out.println("**************************************");
        System.out.println("* 1. Nhập danh sách                  *");
        System.out.println("* 2. Xuất danh sách                  *");
        System.out.println("* 3. Cập nhật nhân viên              *");
        System.out.println("* 4. Xóa nhân viên                   *");
        System.out.println("* 5. Sắp xếp theo tên                *");
        System.out.println("* 6. Sắp xếp theo thu nhập           *");
        System.out.println("* 7. In ra 5 người thu nhập cao nhất *");
        System.out.println("**************************************");
    }
    public static void menuChinh(){
        while(true){
            bangMenu();
            int soMenu = nhapINT("Hãy chọn 1 menu: ");
            switch(soMenu){
                case 1: menuNhap(ds); break;
                case 2: menuXuat(ds); break;
                case 3: menuSua(ds); break;
                case 4: xoaTheoMa(ds);break;
                case 5: sapXepTen(ds);break;
                case 6: sapXepThuNhap(ds);break;
                case 7: xuat5CaoNhat(ds);
            }
            String tiep = nhapSTRING("Để tiếp tục chương trình hãy gõ khác n: ");
            if( tiep.equalsIgnoreCase("N")) break;
        }        
    }
    
}

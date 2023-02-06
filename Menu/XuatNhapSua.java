package Menu;


import java.util.ArrayList;
import KieuDL.NhanVien;
import static NhapXuatDS.NhapDS.nhapNV;
import static NhapXuatDS.NhapDS.nhapTP;
import static NhapXuatDS.NhapDS.nhapTT;
import static NhapXuatDS.XuatDS.xuatHet;
import static NhapXuatDS.XuatDS.xuatTheoKhoangLuong;
import static NhapXuatDS.XuatDS.xuatTheoMa;
import static SuaXoa.SuaTheoMa.suaDoanhSoBanHang;
import static SuaXoa.SuaTheoMa.suaLuong;
import static SuaXoa.SuaTheoMa.suaLuongTrachNhiem;
import static SuaXoa.SuaTheoMa.suaTen;
import static SuaXoa.SuaTheoMa.suaTyLeHoaHong;
import static Nhap.BanPhim.nhapINT;
import static Nhap.BanPhim.nhapSTRING;

public class XuatNhapSua{
    public static void menuNhap(ArrayList<NhanVien> ds){
        while (true) {            
            System.out.println("************************");
            System.out.println("* 1. Nhập nhân viên    *");
            System.out.println("* 2. Nhập trưởng phòng *");
            System.out.println("* 3. Nhập tiếp thi     *");
            System.out.println("************************");
            int ch = nhapINT("Chọn 1 menu: ");
            switch(ch){
                case 1 : nhapNV(ds);break;
                case 2 : nhapTP(ds);break;
                case 3 : nhapTT(ds);
            }
            String tiep = nhapSTRING("Để nhập tiếp nhân viên hãy gõ khác n:");
            if(tiep.equalsIgnoreCase("N")) break;
        }
    }
    public static void menuXuat(ArrayList<NhanVien> ds){
        System.out.println("***************************************");
        System.out.println("* 1. Xuất tất cả nhân viên            *");
        System.out.println("* 2. Xuất nhân viên có mã             *");
        System.out.println("* 3. Xuất nhân viên theo khoảng lương *");
        System.out.println("***************************************");
        int ch = nhapINT("Chọn 1 menu: ");
        switch(ch){
            case 1 : xuatHet(ds);break;
            case 2 : xuatTheoMa(ds);break;
            case 3 : xuatTheoKhoangLuong(ds);
        }
    }
    public static void menuSua(ArrayList<NhanVien> ds){
        while (true) {            
            System.out.println("****************************");
            System.out.println("* 1. Sửa tên               *");
            System.out.println("* 2. Sửa lương             *");
            System.out.println("* 3. Sửa lương trách nhiệm *");
            System.out.println("* 4. Sửa doanh số bán hàng *");
            System.out.println("* 5. Sửa tỷ lệ hoa hồng    *");
            System.out.println("****************************");
            int ch = nhapINT("Chọn 1 menu: ");
            switch(ch){
                case 1 : suaTen(ds);break;
                case 2 : suaLuong(ds);break;
                case 3 : suaLuongTrachNhiem(ds);break;
                case 4 : suaDoanhSoBanHang(ds);break;
                case 5 : suaTyLeHoaHong(ds);
            }
            String tiep = nhapSTRING("Để tiếp tục sửa hãy gõ khác n:");
            if(tiep.equalsIgnoreCase("N")) break;
        }
    }
}

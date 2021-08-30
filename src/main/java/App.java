import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] main) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        Fraction ps = new Fraction(random.nextInt(30)+10, random.nextInt(30)+10 );

        System.out.println("Phan so thứ nhất: " + ps);
        System.out.println("Rut gon: " + ps.rutGon());
        Fraction ps1 = new Fraction(random.nextInt(30)+10, random.nextInt(30)+10 );
        System.out.println("Phan so thứ hai: " + ps1);
        System.out.println("Tổng: \t\t" + ps+" + "+ ps1+" = "+ ps.cong(ps1));
        System.out.println("Hiệu: \t\t" + ps+" - "+ ps1+" = "+ ps.tru(ps1));
        System.out.println("Tích : \t\t" + ps+" * "+ ps1+" = "+ ps.nhan(ps1));
        System.out.println("Thương: \t" + ps+" / "+ ps1+" = "+ ps.chia(ps1));
        toiGian(ps);
        duongSo(ps);
        //quiDong(ps,ps1);
        soSanh(ps,ps1);


        //don thuc
        System.out.println("\n---Đơn thức---: ");
        DonThuc donThuc = new DonThuc(random.nextInt(10)+1,random.nextInt(5)+1);
        System.out.println("Dơn thức thứ nhất: " + donThuc);
        DonThuc donThuc2 = new DonThuc(random.nextInt(10)+1,random.nextInt(5)+1);
        System.out.println("Dơn thức thứ hai: " + donThuc2);
        System.out.println("Tích : \t\t" + donThuc+" * "+ donThuc2+" = "+ donThuc.tich(donThuc2));
        System.out.println("Đạo hàm cấp 1: " + donThuc.daoHamCap1());
        int k = random.nextInt((donThuc.getN()))+1;
        System.out.println("Đạo hàm cấp " + k +": " + donThuc.daoHamCapK(k));
        int x = random.nextInt(10)+1;
        System.out.println("Khi x =  " + x +" đơn thức có giá trị: " + donThuc.giaTri(x));


        //Điểm
        System.out.println("\n---Điểm---: ");
        Diem diem1 = new Diem(random.nextInt(20)-10, random.nextInt(20)-10);
        System.out.println("Điểm thứ nhất: " + diem1);
        Diem diem2 = new Diem(random.nextInt(20)-10, random.nextInt(20)-10);
        System.out.println("Điểm thứ hai: " + diem2);
        System.out.println("Khoản cách giữa : \t\t" + diem1+" * "+ diem2+" = "+ diem1.khoangCach(diem2));
        System.out.println("Điểm đối xứng góc tọa độ: " + diem1.doiXungGoc());
        System.out.println("Điểm đối xứng Ox: " + diem1.doiXungOx());
        System.out.println("Điểm đối xứng Oy: " + diem1.doiXungOy());
        System.out.println("Điểm: " + diem1 + " thuộc "+  phanTuDiem(diem1.phanTu()));

        //Tam giác
        System.out.println("\n---Tam giác---: ");
        int a = 0,b = 0,c= 0;
        a= random.nextInt(10)+1;
        b= random.nextInt(10)+1;
        c= random.nextInt(10)+1;
        do {
            a= random.nextInt(10)+1;
            b= random.nextInt(10)+1;
            c= random.nextInt(10)+1;
        }while (a + b <= c || a + c <= b || b + c <= a);
        TamGiac tamGiac = new TamGiac(a,b,c);
        System.out.println("Tam giác: " + tamGiac);
        System.out.println("Chu vi tam giác: " + tamGiac.chuVi());
        System.out.println("Diện tích tam giác: " + tamGiac.dienTich());

    }

    public static void toiGian(Fraction ps){
        if (ps.toiGian())
            System.out.println(ps +" không là phân số tối giản");
        else
        System.out.println(ps +" là phân số tối giản");
    }

    public static void duongSo(Fraction ps){
        if (ps.duongSo())
            System.out.println(ps +" là phân số dương");
        else
            System.out.println(ps +" là phân số âm");
    }

    public static void quiDong(Fraction ps,Fraction ps1){
        int mauChung = ps.rutGon().getTuMau() * ps1.rutGon().getTuMau();
        int tu1 = ps.rutGon().getTuSo()*mauChung;
        int tu2 = ps1.rutGon().getTuSo()*mauChung;
        ps.setTuSo(tu1);
        ps.setTuMau(mauChung);
        ps1.setTuSo(tu2);
        ps1.setTuMau(mauChung);

        System.out.println("Qui đồng: \t" + ps.rutGon().toString()+" | "+ ps1.rutGon().toString());

    }

    public static void soSanh(Fraction ps,Fraction ps1){
        if (ps.soSanh(ps1) == 1)
            System.out.println("So sanh: \t" + ps.rutGon()+" < "+ ps1.rutGon());
        else if (ps.soSanh(ps1) == -1)
            System.out.println("So sanh: \t" + ps.rutGon()+" < "+ ps1.rutGon());
        else
            System.out.println("So sanh: \t" + ps.rutGon()+" < "+ ps1.rutGon());

    }

    public static String phanTuDiem(int n){
        String result = "";
        switch (n){
            case 1: result = "Phần tư trên bên phải";
                break;
            case 2: result = "Phần tư trên bên trái";
                break;
            case 3: result = "Phẩn tư dưới bên phải";
                break;
            case 4: result = "Phần tư dưới bên trái";
                break;
            case 5: result = "Y trên trục Ox và phần bên phải";
                break;
            case 6: result = "Y trên trục Ox và phần bên trái";
                break;
            case 7: result = "X trên trục Oy và phần bên trên";
                break;
            case 8: result = "X trên trục Oy và phần bên dưới";
                break;
        }
        return result;
    }

}

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] main) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        Fraction ps = new Fraction(random.nextInt(30)-10, random.nextInt(30)-10 );

        System.out.println("Phan so thứ nhất: " + ps);
        System.out.println("Rut gon: " + ps.rutGon());
        Fraction ps1 = new Fraction(random.nextInt(30)-10, random.nextInt(30)-10 );
        System.out.println("Phan so thứ hai: " + ps1);
        System.out.println("Tổng: \t\t" + ps+" + "+ ps1+" = "+ ps.cong(ps1));
        System.out.println("Hiệu: \t\t" + ps+" - "+ ps1+" = "+ ps.tru(ps1));
        System.out.println("Tích : \t\t" + ps+" * "+ ps1+" = "+ ps.nhan(ps1));
        System.out.println("Thương: \t" + ps+" / "+ ps1+" = "+ ps.chia(ps1));
        toiGian(ps);
        duongSo(ps);
        //quiDong(ps,ps1);
        soSanh(ps,ps1);

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

}

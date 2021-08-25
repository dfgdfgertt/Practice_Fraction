import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] main) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        Fraction ps = new Fraction(random.nextInt(30)-10, random.nextInt(30)-10 );

        System.out.println("Phan so thứ nhất: " + ps.toString());
        System.out.println("Rut gon: " + ps.rutGon());
        Fraction ps1 = new Fraction(random.nextInt(30)-10, random.nextInt(30)-10 );
        System.out.println("Phan so thứ hai: " + ps1.toString());
        System.out.println("Tổng: \t\t" + ps.toString()+" + "+ ps1.toString()+" = "+ ps.cong(ps1));
        System.out.println("Hiệu: \t\t" + ps.toString()+" - "+ ps1.toString()+" = "+ ps.tru(ps1));
        System.out.println("Tích : \t\t" + ps.toString()+" * "+ ps1.toString()+" = "+ ps.nhan(ps1));
        System.out.println("Thương: \t" + ps.toString()+" / "+ ps1.toString()+" = "+ ps.chia(ps1));
        System.out.println(ps.toString() +" là phân số tối giản: " + toiGian(ps));
        System.out.println(ps.toString() +" là phân số dương: " + duongSo(ps));

        quiDong(ps,ps1);
        soSanh(ps,ps1);

    }

    public static boolean toiGian(Fraction ps){
        if (ps.getTuSo() == ps.rutGon().getTuSo() && ps.getTuMau() == ps.rutGon().getTuMau()) {
            return true;
        }
        return false;
    }

    public static boolean duongSo(Fraction ps){
        if ((ps.getTuSo()/ps.getTuMau()) >= 0) {
            return true;
        }
        return false;
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
        String phep = "";
        if (ps.getTuSo()/ps.getTuMau() > ps1.getTuSo()/ps1.getTuMau())
            phep = ">";
        else if (ps.getTuSo()/ps.getTuMau() < ps1.getTuSo()/ps1.getTuMau())
            phep = "<";
        else
            phep = "=";
        System.out.println("So sanh: \t" + ps.rutGon().toString()+" "+ phep + " "+ ps1.rutGon().toString());

    }

}

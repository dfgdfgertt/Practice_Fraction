public class Fraction {

    private int tuSo, mauSo;

    public int getTuSo() {
        return tuSo;
    }

    public int getTuMau() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setTuMau(int mauSo) {
        this.mauSo = mauSo;
    }

    public Fraction(int t, int m)
    {
        tuSo=t;
        mauSo=m;
        if (m == 0) {
            mauSo++;
        }
    }

    private static int ucln(int a, int b) {
        if (b == 0) return a;
        return ucln(b, a % b);
    }
    public Fraction rutGon()
    {
        int tu = tuSo;
        int mau = mauSo;
        int uc = ucln(tuSo,mauSo);
        tu = tu / uc; mau = mau / uc;
        Fraction result = new Fraction(tu, mau);
        return result;
    }

    public Fraction cong(Fraction ps)
    {
        int tu = tuSo*ps.mauSo + mauSo*ps.tuSo;
        int mau=mauSo*ps.mauSo;
        Fraction result = new Fraction(tu,mau);
        return result.rutGon();
    }

    public Fraction tru(Fraction ps)
    {
        int tu = tuSo * ps.mauSo - mauSo * ps.tuSo;
        int mau = mauSo * ps.mauSo;
        Fraction result = new Fraction(tu, mau);
        return result.rutGon();
    }

    public Fraction nhan(Fraction ps)
    {
        int tu = tuSo * ps.tuSo;
        int mau = mauSo * ps.mauSo;
        Fraction result = new Fraction(tu, mau);
        return result.rutGon();
    }

    public Fraction chia(Fraction ps)
    {
        int tu = tuSo * ps.mauSo;
        int mau = mauSo * ps.tuSo;
        Fraction result = new Fraction(tu, mau);
        return result.rutGon();
    }

    public int soSanh(Fraction ps){
        if (this.getTuSo()/ps.getTuMau() > ps.getTuSo()/ps.getTuMau())
            return 1;
        else if (this.getTuSo()/ps.getTuMau() < ps.getTuSo()/ps.getTuMau())
            return -1;
        else
            return 0;
    }

    public boolean toiGian(){
        if (tuSo == this.rutGon().getTuSo() && mauSo == this.rutGon().getTuMau()) {
            return true;
        }
        return false;
    }

    public boolean duongSo(){
        if ((tuSo > 1 && mauSo >1) || (tuSo < 1 && mauSo < 1)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return (tuSo+"/"+mauSo);
    }
}

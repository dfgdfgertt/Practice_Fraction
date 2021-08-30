import static java.lang.Math.pow;

public class DonThuc {
    private int a,n;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public DonThuc(int a, int n) {
        this.setA(a);
        this.setN(n);
    }

    public DonThuc tich(DonThuc dt){
        int newA = a*dt.getA();
        int newN = n+ dt.getN();
        DonThuc result = new DonThuc(newA,newN);
        return result;
    }

    public DonThuc daoHamCap1(){
        int newA = a*n;
        int newN = n-1;
        DonThuc result = new DonThuc(newA,newN);
        return result;
    }

    public DonThuc daoHamCapK(int k){
        DonThuc result = this;
        for (int i = 0; i < k; i++) {
            // chặn mũ âm
            if (result.getN() == 0) {
                return  result;
            }
            result= result.daoHamCap1();
        }
        return  result;
    }

    public int giaTri(int x){
        return (int) (a*pow(x,n));
    }


    @Override
    public String toString() {
        if (n == 0) {
            return ""+a+"";
        }
        return "" +  a + "x^" + n + "";
    }
}

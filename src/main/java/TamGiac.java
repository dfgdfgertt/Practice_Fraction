public class TamGiac {
    private int a,b,c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int triangleCheck(){
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            //System.out.print("Đây là tam giác");
            if ((a == b) && (b == c) && (c == a)) {
                return 2;
                //System.out.println(" và là tam giác đều!");
            } else if ((a == b) || (b == c) || (c == a)) {
                return 3;
                //System.out.println(" và là tam giác cân!");
            } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
                return 4;
                //System.out.println(" và là tam giác vuông!");
            }else
                return 1;
                //System.out.println(" thường!");
        }
        else {
            return 0;
            //System.out.println("Đây không phải tam giác.");
        }
    }

    public int chuVi(){
        return a+b+c;
    }

    public float dienTich(){
        float p = (float)this.chuVi()/2;
        return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "TamGiac{ " +
                "canh a=" + a +
                ", canh b=" + b +
                ", canh c=" + c +
                '}';
    }
}

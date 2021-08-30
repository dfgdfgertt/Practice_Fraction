public class Diem {
    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Tọa độ{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int khoangCach(Diem d){
        int  canh1= d.getX() - x;
        int canh2= d.getY() - y;
        int result = (int) Math.sqrt(canh1*canh1 + canh2*canh2);
        return result;
    }

    public Diem doiXungGoc(){
        int newX = -(x);
        int newY = -(y);
        Diem result =  new Diem(newX,newY);
        return result;
     }

    public Diem doiXungOy(){
        int newX = -(x);
        Diem result =  new Diem(newX,y);
        return result;
    }

    public Diem doiXungOx(){
        int newY = -(y);
        Diem result =  new Diem(x,newY);
        return result;
    }

    public int phanTu(){
        if (x > 0 && y > 0) {
            return 1;
        }else if (x < 0 && y > 0) {
            return 2;
        }else if (x > 0 && y < 0) {
            return 3;
        }else if (x < 0 && y < 0) {
            return 4;
        }else if (x == 0 && y > 0) {
            return 5;
        }else if (x == 0 && y < 0) {
            return 6;
        }else if (x > 0 && y == 0) {
            return 7;
        }else if (x < 0 && y == 0) {
            return 8;
        }else


            return 0;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

package $4_LopVaDoiTuongTrongJava.BaiTap.XayDungLopQuadraticEquation;


//Tạo lớp QuadraticEquation , khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (contructors).
public class QuadraticEquation {
    private double a, b, c;


    public QuadraticEquation() {

    }

    //Định nghĩa phương thức gettter cho a, b và c.
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //ịnh nghĩa phương thức getDiscriminant() trả về delta theo công thức delta = b2 - 4ac.
    public double getDiscriminant() {
        return b * 2 - 4 * a * c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) return 0;
        return ((-b + Math.sqrt(this.getDiscriminant())) / (2 * a));
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) return 0;
        return ((-b - Math.sqrt((this.getDiscriminant()))) / (2 * a));
    }
}

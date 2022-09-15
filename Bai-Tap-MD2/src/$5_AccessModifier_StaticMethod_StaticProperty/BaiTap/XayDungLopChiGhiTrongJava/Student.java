package $5_AccessModifier_StaticMethod_StaticProperty.BaiTap.XayDungLopChiGhiTrongJava;

public class Student {
    private String ten = "Luận";
    private String lop = "C0722G1";

    public Student() {
    }

    public Student(String ten, String lop) {
        this.ten = ten;
        this.lop = lop;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

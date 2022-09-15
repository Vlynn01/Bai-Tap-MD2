package $4_LopVaDoiTuongTrongJava.BaiTap.XayDungLopFan;

public class runFan {
    public static void main(String[] args) {
        Fan f1 = new Fan(3, true, 10, "yellow");
        System.out.println("Fan1: " + f1);
        Fan f2 = new Fan();
        f2.setColor("red");
        System.out.println("Fan2: " + f2);

    }
}

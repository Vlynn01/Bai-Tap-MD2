package $15_XuLiNgoaiLe_Debug.BaiTap.SuDungLopIllegalTriangleException;

public class TestTriangle {
    public static void main(String[] args) {
        try {
            new Triangle(2, 2, 3);
            new Triangle(-5, 2, 3);
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
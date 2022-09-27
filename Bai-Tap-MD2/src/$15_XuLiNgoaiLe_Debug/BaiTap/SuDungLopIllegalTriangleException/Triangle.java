package $15_XuLiNgoaiLe_Debug.BaiTap.SuDungLopIllegalTriangleException;

public class Triangle {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        checkTriangle();
    }

    public boolean isTriangle() {
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
    }

    private void checkTriangle() throws IllegalTriangleException {
        if (!isTriangle()) {
            throw new IllegalTriangleException();
        }
    }
}
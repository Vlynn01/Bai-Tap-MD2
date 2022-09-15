package $7_AbstractClass_Interface.BaiTap.TrienKhaiInterface_Resizeable_ChoCacLopHinhHoc;


public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public void resize(double percent) {
        this.width *= percent/100;
        this.length *= percent/100;
    }

    @Override
    public String toString() {
        return "Rectangle{width="
                + getWidth()
                + " and length="
                + getLength() + ", "
                + "color=" + getColor() + ", " +
                "filled=" + isFilled() +
                '}';
    }
}
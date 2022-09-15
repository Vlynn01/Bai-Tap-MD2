package $7_AbstractClass_Interface.BaiTap.TrienKhaiInterface_Colorable_ChoCacLopHinhHoc;

public class Square extends Rectangle implements Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    @Override
    public String toString() {
        return "hinhhoc2.Square{side="
                + getSide()
                + ", color="
                + getColor()
                + ", filled="
                + isFilled()
                +"}";
    }
}
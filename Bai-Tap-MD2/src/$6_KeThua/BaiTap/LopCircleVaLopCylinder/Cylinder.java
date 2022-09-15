package $6_KeThua.BaiTap.LopCircleVaLopCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() + " " +
        '}';
    }
}

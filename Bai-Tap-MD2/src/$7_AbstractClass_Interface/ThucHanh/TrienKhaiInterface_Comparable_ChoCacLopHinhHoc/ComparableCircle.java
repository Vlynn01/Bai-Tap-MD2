package $7_AbstractClass_Interface.ThucHanh.TrienKhaiInterface_Comparable_ChoCacLopHinhHoc;

import $7_AbstractClass_Interface.ThucHanh.TrienKhaiInterface_Comparator_DeSoSanhCacLopHinhHoc.Circle;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}

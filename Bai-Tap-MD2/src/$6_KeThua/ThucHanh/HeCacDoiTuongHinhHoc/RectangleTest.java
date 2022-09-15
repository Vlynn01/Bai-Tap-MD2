package $6_KeThua.ThucHanh.HeCacDoiTuongHinhHoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 6.0);
        System.out.println(rectangle);

        rectangle = new Rectangle(3.0, 7.0, "orange", false);
        System.out.println(rectangle);
    }
}

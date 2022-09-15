package $7_AbstractClass_Interface.BaiTap.TrienKhaiInterface_Colorable_ChoCacLopHinhHoc;

import $7_AbstractClass_Interface.BaiTap.TrienKhaiInterface_Resizeable_ChoCacLopHinhHoc.Circle;
import $7_AbstractClass_Interface.BaiTap.TrienKhaiInterface_Resizeable_ChoCacLopHinhHoc.Rectangle;
import $7_AbstractClass_Interface.BaiTap.TrienKhaiInterface_Resizeable_ChoCacLopHinhHoc.Shape;
import $7_AbstractClass_Interface.BaiTap.TrienKhaiInterface_Resizeable_ChoCacLopHinhHoc.Square;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.4);
        shapes[1] = new $7_AbstractClass_Interface.BaiTap.TrienKhaiInterface_Resizeable_ChoCacLopHinhHoc.Rectangle(3, 5);
        shapes[2] = new Square(30);

        for (Shape sh : shapes) {
            System.out.println("àud" + sh);
        }
        System.out.println("----------------------");
        for (Shape sh : shapes) {

            if (sh instanceof Circle) {
                ((Circle) sh).resize(Math.floor(Math.random() * 100 + 1));
            } else if (sh instanceof $7_AbstractClass_Interface.BaiTap.TrienKhaiInterface_Resizeable_ChoCacLopHinhHoc.Rectangle) {
                ((Rectangle) sh).resize(Math.floor(Math.random() * 100 + 1));
            }
            System.out.println("Sau khi sửa " + sh);

        }
    }
}

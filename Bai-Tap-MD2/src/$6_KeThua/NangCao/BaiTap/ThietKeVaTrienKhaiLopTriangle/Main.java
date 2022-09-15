package $6_KeThua.NangCao.BaiTap.ThietKeVaTrienKhaiLopTriangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle= new Triangle();
        System.out.println("Chu vi là: "+ triangle.getPerimeter());
        System.out.println("Diện tích là: "+triangle.getArea());

        triangle= new Triangle(3,4,5);
        System.out.println("Chu vi là: "+triangle.getPerimeter());
        System.out.println("Diện tích là: "+triangle.getArea());
    }
}

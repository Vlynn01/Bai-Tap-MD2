package $5_AccessModifier_StaticMethod_StaticProperty.ThucHanh.StaticMethod;

public class StaticMethod {

    //Xây dựng lớp Student, xây dựng phương thức tĩnh change()
    public static class Student {
        private final int rollno;
        private final String name;
        private static String college = "BBDIT";

        // hàm tạo để khởi tạo biến
        Student(int r, String n) {
            rollno = r;
            name = n;
        }

        //// phương thức static để thay đổi giá trị của biến static
        static void change() {
            college = "CODEGYM";
        }

        // phương thức hiển thị giá trị
        void display() {
            System.out.println(rollno + "" + name + "" + college);
        }
    }
}


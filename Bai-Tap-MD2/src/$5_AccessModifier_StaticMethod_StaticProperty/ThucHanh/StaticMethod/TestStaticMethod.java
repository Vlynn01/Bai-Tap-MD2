package $5_AccessModifier_StaticMethod_StaticProperty.ThucHanh.StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod.Student.change(); //calling change method

        //tạo object
        StaticMethod.Student s1 = new StaticMethod.Student(111, "Hoang");
        StaticMethod.Student s2 = new StaticMethod.Student(222, "Khanh");
        StaticMethod.Student s3 = new StaticMethod.Student(333, "Nam");

        //gọi phương thức hiển thị
        s1.display();
        s2.display();
        s3.display();
    }
}
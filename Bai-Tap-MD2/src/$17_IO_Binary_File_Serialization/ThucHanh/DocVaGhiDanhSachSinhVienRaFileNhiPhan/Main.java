package $17_IO_Binary_File_Serialization.ThucHanh.DocVaGhiDanhSachSinhVienRaFileNhiPhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Văn Luận", "Hải Phòng"));
        students.add(new Student(2, "Nguyễn Hà Linh", "Hải Phòng"));
        students.add(new Student(3, "Nguyễn Văn An", "Hà Nội"));
        students.add(new Student(4, "Hoàng Như Huyền", "Hà Nội"));
        writeToFile("student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student s : studentDataFromFile) {
            System.out.println(s);
        }
    }


}

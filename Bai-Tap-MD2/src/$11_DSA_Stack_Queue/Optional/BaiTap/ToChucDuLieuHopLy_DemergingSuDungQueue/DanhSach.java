package $11_DSA_Stack_Queue.Optional.BaiTap.ToChucDuLieuHopLy_DemergingSuDungQueue;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DanhSach<E> {
    String tenThuMuc;
    String tenFile;
    File file;

    public void taoThuMuc(String folderName) {
        this.tenThuMuc = folderName;
        File dir = new File(folderName);
        while (!dir.exists()) {
            dir.mkdir();
        }

    }

    public void taoFile(String fileName) throws IOException {
        this.tenFile = fileName;

        File file = new File(this.tenThuMuc + "/" + fileName + ".txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        this.file = file;
    }

    public void taoDanhSach(E e) throws IOException {
        FileWriter fileWriter = new FileWriter(this.file);
        fileWriter.write(e.toString());
        fileWriter.close();
    }


    public static void main(String[] args) {

        Person[] people = {
                new Person("dung", "male", new int[]{17, 9, 1997}),
                new Person("thuy", "female", new int[]{1, 1, 1988}),
                new Person("tung", "male", new int[]{15, 3, 1995}),
                new Person("adam", "male", new int[]{1, 3, 1994}),
                new Person("eva", "female", new int[]{1, 7, 1996})
        };

        /*try {
            File file = new File("thumuc/test.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            Writer writer = new BufferedWriter(fileWriter);
            for (Person person : people)
                writer.write(person.toString());
            writer.close();
        } catch (Exception e) {
        }*/
       /* ArrayList<Person> personArrayList= new ArrayList< >();
        Person data = null;
        try {
            File file = new File("thumuc/test.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            if (!bufferedReader.ready()){
                throw  new IOException();
            }
            while (bufferedReader.readLine()!= null){
                data = bufferedReader.read( );
                personArrayList.add(data);
            }
        }catch (Exception e){
        }*/


    }

}
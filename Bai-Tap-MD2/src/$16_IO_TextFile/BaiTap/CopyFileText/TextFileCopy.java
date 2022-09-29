package $16_IO_TextFile.BaiTap.CopyFileText;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopy {
    public static void copyFile(File original, File clone) throws IOException {
        FileReader fileReader = new FileReader(original);
        FileWriter fileWriter = new FileWriter(clone);

        int count;
        while ((count = fileReader.read()) != -1) {
            fileWriter.write(count);
        }
        fileWriter.close();
        fileReader.close();
    }
}
package $16_IO_TextFile.BaiTap.CopyFileText;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String pathOriginal = "G:\\codegym\\module2\\btCopyFileText\\src\\original.txt";
        String pathClone = "G:\\codegym\\module2\\btCopyFileText\\src\\cloneOriginal.txt";
        File original;
        File cloneOriginal;

        try {
            original = new File(pathOriginal);
            if (!original.exists()) {
                original.createNewFile();
            }
            cloneOriginal = new File(pathClone);
            if (!cloneOriginal.exists()) {
                cloneOriginal.createNewFile();
            }
            TextFileCopy.copyFile(original, cloneOriginal);
            System.out.println("Successful!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
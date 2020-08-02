package Collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Collections {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("f:/Download/moscow-buildings.csv");
        int length = stream.available();
        byte[] Data = new byte[length];
        stream.read(Data);

        String text = new String(Data);
        System.out.println(text);
    }
}

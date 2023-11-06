package IO.DataOutputStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
数据专属流
DataOutputStream：可以将数据和数据类型一起写入文件（这个文件不是普通文本文件，用记事本打不开）
 */
public class DataOutputStreamTest {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("10-IO/src/IO/DataOutputStream/data"));
        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400;
        float f = 3.0f;
        double d = 2.34;
        boolean sex = false;
        char c = 'a';
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(sex);
        dos.writeChar(c);

        dos.flush();
        dos.close();
    }
}

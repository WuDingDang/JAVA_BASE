package IO.DataOutputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
DataInputStream:数据字节输入流
DataOutputStream写的文件，只能使用DataInputStream去读，并且读的时候需要提前知道写的顺序
读的顺序和写的顺序一致，才能正常取出数据
 */
public class DataInputStreamTest {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("10-IO/src/IO/DataOutputStream/data"));
        System.out.println(dis.readByte());
        System.out.println(dis.readShort());
        System.out.println(dis.readInt());
        System.out.println(dis.readLong());
        System.out.println(dis.readFloat());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        dis.close();




    }
}

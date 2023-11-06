package IO.PrintStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

/*
PrintStream:标准的字节输出流，默认输出到控制台
 */
public class PrintStreamTest {
    public static void main(String[] args) throws Exception{
        System.out.println("hello");
        PrintStream ps = System.out;
        ps.println("kk");
        ps.println("ll");
        //标准输出流不需要手动关闭
        //改变标准输出流的输出方向
        //标准输出流不再指向控制台，指向"psfile"文件
        PrintStream printStream = new PrintStream(new FileOutputStream("psfile"));
        //修改输出方向，将输出方向改到“psfile”文件
        System.setOut(printStream);
        System.out.println("hellokitty");
        System.out.println("hellowdd");
    }
}

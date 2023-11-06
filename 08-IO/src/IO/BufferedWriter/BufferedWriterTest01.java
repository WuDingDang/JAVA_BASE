package IO.BufferedWriter;

import java.io.*;

/*
BufferedWriter:带有缓冲的字符输出流
 */
public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("10-IO/src/IO/BufferedWriter/bufferw"));
        //BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("10-IO/src/IO/BufferedWriter/bufferw")));
        bw.write("hello!!!");
        bw.write("kkk");
        bw.flush();
        bw.close();
    }
}

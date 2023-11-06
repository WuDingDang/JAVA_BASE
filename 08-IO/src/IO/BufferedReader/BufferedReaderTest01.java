package IO.BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
BufferedReader:
    带有缓冲区的字符输入流，使用这个流的时候不需要自定义char数组、byte数组，自带缓冲
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("file");
        //当一个流的构造方法中需要一个流的时候，被传进来的流叫节点流
        //外部负责包装的流叫包装流（处理流）
        //FileReader是节点流，BufferedReader是包装流/处理流
        BufferedReader br = new BufferedReader(reader);

        //读一行,不带换行符
        String firstLine = br.readLine();

        String s = null;
        while((s = br.readLine())!= null){
            System.out.println(s);
        }
        //对于包装流来说，只需要关闭最外层的流，里面的节点流会自动关闭
        br.close();

    }
}


package IO.BufferedReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/*

 */
public class BufferefReaderTest02 {
    public static void main(String[] args) throws Exception {
        //字节流
        FileInputStream in = new FileInputStream("file");
        //通过转换流转换(将字节流转为字符流)
        //in是节点流，reader是包装流
        InputStreamReader reader = new InputStreamReader(in);
        //构造方法只能传字符流，不能传字节流
        //reader是节点流，br是包装流
        BufferedReader br = new BufferedReader(reader);

        //方法二 合并
        //BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("file")));
        String s = null;
        while((s = br.readLine()) != null){
            System.out.println(s);
        }
        br.close();
    }
}

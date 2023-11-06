package IO.Copy;

import java.io.*;

/*
拷贝目录
 */
public class Copy03 {
    public static void main(String[] args) {
        //拷贝源
        File srcFile = new File("D:/a/b");
        //拷贝目标
        File destFile = new File("E:/");
        //调用方法拷贝
        copyDir(srcFile,destFile);
    }

    public static void copyDir(File srcFile,File destFile){
        if(srcFile.isFile()){
            //srcFile如果是一个文件，递归结束
            //是文件，需要拷贝，一边读，一边写
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                in = new FileInputStream(srcFile);
                System.out.println(srcFile.getAbsolutePath());
                String path = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") + srcFile.getAbsolutePath().substring(3);
                System.out.println(path);
                out = new FileOutputStream(path);
                int readCount = 0;
                byte[] bytes = new byte[1024 * 1024];
                while( (readCount = in.read(bytes)) != -1){
                    out.write(bytes,0,readCount);
                }
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if(in != null){
                        in.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if(out != null){
                        out.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return;
        }
        //获取源下面的子目录
        File[] files = srcFile.listFiles();
        for(File file:files){
            System.out.println(file.getAbsolutePath());
            if(file.isDirectory()){
                //新建对应目录
                String srcDir = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") + srcDir.substring(3);
                System.out.println(destDir);
                File newFile = new File(destDir);
                if(!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            copyDir(file,destFile);
        }
    }
}

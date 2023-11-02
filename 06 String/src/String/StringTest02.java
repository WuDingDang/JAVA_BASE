package String;

/*
String类中常用方法
 */
public class StringTest02 {
    public static void main(String[] args) {
        //1、 s.chatAt(int)
        char c = "中国人".charAt(1);
        System.out.println(c);     //国

        //2、 s1.compareTo(s2)  按字典顺序比较字符串
        System.out.println("abc".compareTo("abc"));           //0(等于0)
        System.out.println("abc".compareTo("abcr"));           //-1(小于0)
        System.out.println("abce".compareTo("abcd"));           //1(大于0)

        //3、 s1.contains(s2)   判断s1是否包含s2
        System.out.println("helloworld".contains("hello"));    //true

        //4、 s1.endsWith(s2)   判断s1是否以s2结尾
        System.out.println("text.txt".endsWith("txt"));
        System.out.println("text.txt".endsWith("java"));

        //5、 s1.equals(s2)     比较两个字符串是否相等
        //6、 s1.equalsIgnoreCase(s2)   比较两个字符串是否相等忽略大小写
        System.out.println("abc".equalsIgnoreCase("AbC"));

        //7、 s.getBytes()      将字符串对象转换成字节数组
        byte[] b = "abcde".getBytes();
        for(int i = 0 ;i < b.length;i ++){
            System.out.print(b[i] + " ");    //97 98 99 100 101
        }
        System.out.println();

        //8、s1.indexOf(s2)    判断某个子字符s2串在当前字符串s1中第一次出现的索引
        System.out.println("helloworldwddhahahellokk".indexOf("wdd"));

        //9、 s.isEmpty()     判断某个字符串是否为空字符串
        System.out.println("".isEmpty());
        System.out.println("wd".isEmpty());

        //判断数组长度是length属性，判断字符串长度是length()方法
        //10、  s.length()    字符串的长度

        //11、 s1.lastIndexOf(s2)    判断某个子字符s2串在当前字符串s1中最后一次出现的索引
        System.out.println("helloworldwddhahahellokk".lastIndexOf("hello"));

        //12、 s.replace(CharSequence target,CharSequence replacement)   把字符串s中的target替换成replacement
        //String 的父接口就是CharSequence
        String str = "javawdd.java".replace("java","txt");
        System.out.println(str);

        //13、 s.replaceAll(String regex,String relpacement)   支持正则表达式

        //14、 s1.split(s2)    以s2作为分割符拆分s1
        String[] ymd = "1999-02-12".split("-");
        for(int i = 0 ;i < ymd.length;i ++){
            System.out.print(ymd[i] + " ");
        }
        System.out.println();

        //15、s1.startsWith(s2)    判断字符串s1是否以子字符串s2开始
        System.out.println("wddhhhaha".startsWith("wdd"));

        //16、 s.substring(起始下标)      截取字符串
        System.out.println("hellowddhahah".substring(3));

        //16、 s.substring(开始下标,结束下标)    左闭右开
        System.out.println("helloworld".substring(2,5));

        //17、 s.toCharArray()   将字符串转换为char数组
        char[] chars = "我是中国人".toCharArray();
        for(int i = 0 ;i < chars.length; i++){
            System.out.println(chars[i]);
        }

        //18、s.toLowerCase()    转成小写
        System.out.println("ADbghTFGH".toLowerCase());

        //19、s.toUpperCase()    转成大写
        System.out.println("ADbghTFGH".toUpperCase());

        //20、 s.trim()    去除字符串前后空白(中间的空白不去掉)
        System.out.println("   wddhello  wo  rld    ".trim());

        //21、String中只有一个方法是静态方法，不需要new对象
        //valueOf   将非字符串转换为字符串
        String s = String.valueOf(true);
        System.out.println(s);
        String s1 = String.valueOf(100);
        System.out.println(s1);    //100 字符串
        String s2 = String.valueOf(new Customer());
        System.out.println(s2);    //没有重写toString()方法，输出的是对象内存地址
        //System.out.println();    打印到控制台上的都是字符串 (调用了String.valueOf()方法,valueOf()方法调用了toString()方法)



    }

}
class Customer{

}

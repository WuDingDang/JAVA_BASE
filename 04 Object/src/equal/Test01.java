package equal;

public class Test01 {
    public static void main(String[] args) {
        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        String s4 = new String("Test");
        System.out.println(s1==s2);    //true
        System.out.println(s1==s3);    //false
        System.out.println(s4==s3);    //false
        System.out.println(s4.equals(s3));    //true
        System.out.println(s4.equals(s1));    //true
        System.out.println(s3.toString());

        /*  Object类的equals方法
	public boolean equals(Object obj){
		return (this == obj);
	}
	*/
    }
}

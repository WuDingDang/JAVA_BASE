
public class Test01 {
    //静态内部类
    static class Inner1{}
    //实例内部类
    class Inner2{}

    public void doSome(){
        //局部内部类
        class Inner3{}
    }
    public void doOther(){
        //局部内部类Inner3在doOther()不能用
    }

    public static void main(String[] args) {
        MyMath mm = new MyMath();
        //mm.mySum(new ComputeImpl(),100,200);
        //使用匿名内部类，表示ComputeImpl这个类没有名字了
        //new Compute()后面的{}表示对接口的实现
        mm.mySum(new Compute(){
            public int sum(int a,int b){
                return a + b;
            }
        },100,200);
    }
}

interface Compute{
    int sum(int a,int b);
}
/*
class ComputeImpl implements Compute{
	public int sum(int a,int b){
		return a+ b;
	}
}
*/
class MyMath{
    public void mySum(Compute c,int x,int y){
        int sum = c.sum(x, y);
        System.out.println(x+"+"+y+"="+sum);
    }
}

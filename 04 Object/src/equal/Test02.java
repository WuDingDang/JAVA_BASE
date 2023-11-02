package equal;

public class Test02 {
    public static void main(String[] args) {
        MyTime m1 = new MyTime(2023,11,3);
        MyTime m2 = new MyTime(2023,11,3);
        System.out.println(m1.equals(m2));
    }
}

class MyTime{
    int year;
    int month;
    int day;
    public MyTime(){}
    public MyTime(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean equals(Object o){
        if(o == null || !(o instanceof MyTime)) return false;
        if(o == this) return true;
        MyTime m = (MyTime) o;
        return m.year == this.year && m.month == this.month && m.day == this.day;
    }
}

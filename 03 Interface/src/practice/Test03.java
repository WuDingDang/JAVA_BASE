package practice;

public class Test03 {
    public static void main(String[] args) {
        FoodMenu foodMenu = new ChinaCooker();
        Customer c = new Customer(foodMenu);
        c.order();
    }
}

interface FoodMenu{
    void xiHongShi();
    void chaoDan();
}

class ChinaCooker implements FoodMenu{

    @Override
    public void xiHongShi() {
        System.out.println("china cooker do xihongshi");
    }

    @Override
    public void chaoDan() {
        System.out.println("china cooker do chaodan");

    }
}

class JapanCooker implements FoodMenu{

    @Override
    public void xiHongShi() {
        System.out.println("japan cooker do xihongshi");
    }

    @Override
    public void chaoDan() {
        System.out.println("japan cooker do chaodan");
    }
}

class Customer {
    private FoodMenu foodMenu;
    public Customer(){}
    public Customer(FoodMenu foodMenu){
        this.foodMenu = foodMenu;
    }
    public void setFoodMenu(FoodMenu foodMenu){ this.foodMenu = foodMenu;}
    public FoodMenu getFoodMenu(){
        return foodMenu;
    }
    public void order(){
        foodMenu.chaoDan();
        foodMenu.xiHongShi();
    }

}

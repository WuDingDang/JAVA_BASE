package equal;

public class Test03 {
    public static void main(String[] args) {
        User u1 = new User("wangwu",new Address("nanjing","xunghuolu","111"));
        User u2 = new User("wangdu",new Address("nanjing","xunghuolu","111"));
        System.out.println(u1.equals(u2));
    }
}

class User{
    String name;
    Address address;

    public User() {
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public boolean equals(Object o){
        if(o == this) return true;
        if(o == null || !(o instanceof User)) return false;
        User u = (User) o;
        return this.address.equals(u.address) && this.name.equals(u.name);
    }
}

class Address{
    String city;
    String street;
    String zip;

    public Address() {
    }

    public Address(String city, String street, String zip) {
        this.city = city;
        this.street = street;
        this.zip = zip;
    }

    public boolean equals(Object o){
        if(o == this) return true;
        if(o == null || !(o instanceof Address)) return false;
        Address a = (Address) o;
        return a.city.equals(this.city) && a.street.equals(this.street) && a.zip.equals(this.zip);
    }
}

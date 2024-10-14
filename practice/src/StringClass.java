

class  Mobile {
    static String name;
    String Brand;
    int price;

    public void show() {
        System.out.println(name + " " + Brand + " " + price);
    }
}

public class StringClass

{
    public static void main(String[] args)
    {
        Mobile aobj1=new Mobile();
        aobj1.name="Mobile";
        aobj1.Brand="Samsung";
        aobj1.price=15000;

        Mobile aobj2=new Mobile();
        aobj2.name="Mobile";
        aobj2.Brand="iphone";
        aobj2.price=19000;
       System.out.println(aobj1.name+" :"+aobj1.price);

       aobj1.name=" Smartphone";
        aobj1.show();
        aobj2.show();
    }

}

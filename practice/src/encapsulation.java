class Human
{
   private int age;//= 19;
   private String name;//= "SHiva";
    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String b) {
        this.name = b;
    }

}

public class encapsulation
{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(25);
        obj.setName("Reddy");
        //obj.age=19;
        //obj.name="SHiva";

        System.out.println(obj.getName()+" "+obj.getAge());
    }
}

//It is used to achieve abstraction
//It supports
interface  I1 {
    //public abstract is the access modifiers used here
    public abstract void show();
    static  void display(){

    }
    public static final int i=10;

}
interface  I2 {
    //public abstract is the access modifiers used here
    public abstract void drive();
    static  void press(){

    }
    public static final int i=20;

}
public class JavaAbsInterface implements I1,I2{
    public void show()//Access specifier should be always at greater level parent interface
    {
        System.out.println("1");
    }
    public void press(){

    }
    public void drive(){

    }

    public static void main(String[] args) {

    }
}

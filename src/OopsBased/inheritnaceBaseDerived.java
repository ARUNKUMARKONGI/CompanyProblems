package OopsBased;

class Base{
    public void print()
    {
        System.out.println("this is base class");
    }
}
class Derived extends Base{
    @Override
    public void print() {
        System.out.println("this is derived class");
    }
}
public class inheritnaceBaseDerived {
    public static void main(String[] args) {
        Base x = new Base();
        Base y = new Derived();
        /*Due to polymorphism, a reference variable of the base class type (Base)
       can be used to refer to an object of the derived class (Derived).*/
        Derived z = new Derived();

        x.print();
        y.print();
        z.print();

        //Derived w = new base(); //this is not allowed, hierarchy must be followed

    }
}

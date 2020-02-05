package operators_and_primitives;

public class Main {

    Main() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
//        short x = 2;
//        short y = 2;
//
//        System.out.println(x*y); //this one is ok
//
//        //short z =x * y;    //this one will cause compile error(on arithmetic operation short is casted to int by default)
//
//        int x1;
//        int y1 = (x1 = 3);
//        System.out.println(x1 + ":" + y1);
//
//        Main main = new Main();

<<<<<<< HEAD
        System.out.println(x*y); //this one is ok

        //short z =x * y;    //this one will cause compile error(on arithmetic operation short is casted to int by default)

        int x1;
        int x12;
        int x31;
        int y1 = (x1 = 3);
        System.out.println(x1 + ":" + y1);

        Main main = new Main();
=======
        System.out.println(count7(712377));
    }
    public static int count7(int n) {
        if (n == 0) return 0;
        if (n%10 == 7) return 1+count7(n/10);
        return 0+count7(n/10);
>>>>>>> test_branch
    }
    {
        System.out.println("static initializer"); //static initializer and fields are initialized before constructor called
    }
}

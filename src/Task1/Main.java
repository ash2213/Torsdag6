package Task1;

public class Main {
    public static void main(String[] args) {
        Methods e= new Methods();
        e.methodA("k");
        System.out.println(e.methodB("a"));
        e.methodC("Katrinas");
        System.out.println(e.methodB("a"));
        e.methodC("Johan");
        e.methodD(11);
        e.methodD(9);
        e.methodC("Hollandaisesovs");
        System.out.println(e.methodB("t"));


    }
}
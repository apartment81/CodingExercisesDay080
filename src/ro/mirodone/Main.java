package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        Maskify maskify = new Maskify();

        System.out.println(maskify.maskify("abcdabcd"));
        System.out.println(maskify.maskify("4556364607935616"));

        MaskClever clever = new MaskClever();

        System.out.println(clever.maskify("abcdabcd"));
        System.out.println(clever.maskify("4556364607935616"));

    }
}

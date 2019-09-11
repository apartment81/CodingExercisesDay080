package ro.mirodone;

public class MaskClever {

    public String maskify(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
}

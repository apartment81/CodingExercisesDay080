package ro.mirodone;


public class Maskify {

    public String maskify(String str) {

        int len = str.length();

        StringBuilder maskedNumber = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);

            if (i < len - 4) {
                maskedNumber.append('#');
            } else {

                maskedNumber.append(c);
            }

        }

        return maskedNumber.toString();
    }



}

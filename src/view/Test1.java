package view;

import model.*;

public class Test1 {

    public static void main(String[] args) {

        long decimal = 756;
        Octal octal = new Octal(777);
        Binary binary = new Binary(111);

        System.out.println(decimal);
        System.out.println(octal);
        System.out.println(binary);

        System.out.println(Octal.parseDecimal(decimal));
        System.out.println(Binary.parseDecimal(decimal));

        System.out.println(Octal.parseBinary(binary));
        System.out.println(Binary.parseOctal(octal));
    }
}

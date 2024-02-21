package model;

public class Hexadecimal {

    private String hexNumber;
    private int decimalValue;

    public Hexadecimal(String hexNumber) {
        try {

            if (!hexNumber.matches("[0-9A-Fa-f]+")) {
                throw new Exception();
            }
            this.hexNumber = hexNumber;
            this.decimalValue = Integer.parseInt(hexNumber, 16);

        } catch (Exception e) {
            System.out.println("Invalid hexadecimal number");
        }

    }

    public Hexadecimal(int decimalValue) {
        this.decimalValue = decimalValue;
        this.hexNumber = Integer.toHexString(decimalValue);
    }

    public static Hexadecimal parseBinary(Binary number) {
        try {
            return new Hexadecimal(Integer.parseInt(number.toString(), 2));
        } catch (Exception e) {
            System.out.println("Invalid binary number");
        }
        return null;
    }

    public static Hexadecimal parseDecimal(Number number) {
        try {
            return new Hexadecimal(Integer.parseInt(number.toString(), 10));
        } catch (Exception e) {
            System.out.println("Invalid decimal number");
        }
        return null;
    }

    public static Hexadecimal parseOctal(Octal number) {
        try {
            return new Hexadecimal(Integer.parseInt(number.toString(), 8));
        } catch (Exception e) {
            System.out.println("Invalid octal number");
        }
        return null;
    }

    @Override
    public String toString() {
        return hexNumber;
    }

    public String toDecimal() {
        return String.valueOf(decimalValue);
    }
}

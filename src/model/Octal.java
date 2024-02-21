package model;

public class Octal {

    private long number;

    public Octal(long number) {

        try {
            if (String.valueOf(number).contains(".")) {
                throw new Exception();
            }
            for (char c : String.valueOf(number).toCharArray()) {
                if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7') {
                    throw new Exception();
                }
            }
            this.number = number;
        } catch (Exception e) {
            System.out.println("Invalid octal number");
        }
    }

    public static Octal parseBinary(Binary number) {

        try {
            return new Octal(Integer.parseInt(Integer.toOctalString(Integer.parseInt(number.toString()))));
        } catch (Exception e) {
            System.out.println("Invalid binary number");
        }
        return null;
    }

    public static Octal parseDecimal(Number number) {

        try {
            return new Octal(Integer.parseInt(Integer.toOctalString(Integer.parseInt(number.toString()))));
        } catch (Exception e) {
            System.out.println("Invalid decimal number");
        }
        return null;
    }

    public static Octal parseHexadecimal(String number) {
        try {
            Integer tempnumber = Integer.parseInt(number, 16);
            return Octal.parseDecimal(tempnumber);
        } catch (Exception e) {
            System.out.println("Invalid hexadecimal number");
        }
        return null;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

}

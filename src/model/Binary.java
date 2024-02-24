package model;

public class Binary {

    private Integer number;

    public Binary(Number number) {
        Integer tempnumber = Integer.parseInt(number.toString());
        try {
            if (String.valueOf(tempnumber).contains(".")) {
                throw new Exception();
            }
            for (char c : String.valueOf(tempnumber).toCharArray()) {
                if (c != '0' && c != '1') {
                    throw new Exception();
                }
            }
            this.number = (int) tempnumber;
        } catch (Exception e) {
            System.out.println("Invalid binary number");
        }
    }

    public static Binary parseOctal(Octal number) {
        try {
            return new Binary(Integer.parseInt(Integer.toBinaryString(Integer.parseInt(number.toString()))));
        } catch (Exception e) {
            System.out.println("Invalid octal number");
        }
        return null;

    }

    public static Binary parseDecimal(Number number) {
        try {
            Integer tempnumber = Integer.parseInt(number.toString());
            if (String.valueOf(tempnumber).contains(".")) {
                throw new Exception();
            }

            return new Binary(Integer.parseInt(Integer.toBinaryString(tempnumber)));

        } catch (Exception e) {
            System.out.println("Invalid decimal number");
        }
        return null;
    }

    public static Binary parseHexadecimal(String number) {
        try {
            Integer tempnumber = Integer.parseInt(number, 16);
            return new Binary(Integer.parseInt(Integer.toBinaryString(tempnumber)));
        } catch (Exception e) {
            System.out.println("Invalid hexadecimal number");
        }
        return null;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    public static Integer toDecimal(Number number) {
        try {
            char tempstring[] = number.toString().toCharArray();
            int tempvalue = 0;
            for (int i = 0; i < tempstring.length; i++) {
                tempvalue += Math.pow(2, tempstring.length - i - 1) * (tempstring[i] - '0');
            }
            return tempvalue;
        } catch (Exception e) {
            System.out.println("Invalid binary number");

        }
        return null;

    }

}

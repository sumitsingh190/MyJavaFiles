package Strings;

public class IntegerToRoman {

    public static String intToRoman(int num) {
        // Arrays of values and their corresponding roman symbols
        int[] values =    {1000, 900, 500, 400, 100, 90,  50,  40, 10, 9, 5, 4, 1};
        String[] symbols ={"M",  "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        // Convert the number
        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        int number = 1994;
        String roman = intToRoman(number);
        System.out.println("Roman numeral of " + number + " is: " + roman);
    }
}



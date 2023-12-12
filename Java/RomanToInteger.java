import java.util.Scanner;

class RomanToInteger {
    public int romanToInteger(String roman) {
        int[] amt = new int[roman.length()];
        for (int i = 0; i < roman.length(); i++) {
            switch (roman.charAt(i)) {
                case 'M':
                    amt[i] = 1000;
                    break;
                case 'D':
                    amt[i] = 500;
                    break;
                case 'C':
                    amt[i] = 100;
                    break;
                case 'L':
                    amt[i] = 50;
                    break;
                case 'X':
                    amt[i] = 10;
                    break;
                case 'V':
                    amt[i] = 5;
                    break;
                case 'I':
                    amt[i] = 1;
                    break;
            }
        }
        int sum = 0;
        for (int i = 0; i < amt.length - 1; i++) {
            if (amt[i] < amt[i + 1])
                sum -= amt[i];
            else
                sum += amt[i];
        }
        return sum + amt[amt.length - 1];
    }

    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman Number : ");
        String roman = sc.nextLine();
        roman = roman.toUpperCase();
        int romToIntVal = obj.romanToInteger(roman);
        System.out.printf("Roman value %s to Integer Value %d", roman, romToIntVal);
        sc.close();
    }
}
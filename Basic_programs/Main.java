public class Main {
    public static void main(String[] args) {
        System.out.println("Java Revision 2024");
        System.out.println("Addiotion : " + addition(2, 3));
        System.out.println("Min Among Three : " + minAmongThree(10, 3, 4));
        System.out.println("Max Among Three : " + maxAmongThree(10, 32, 14));
        System.out.println("Even Number : " + checkEven(7));
        System.out.println("Factorial Number : " + factorialNumber(5));
        System.out.println("Pattern 1 : ");
        patter1(5);
        System.out.println("Binary Addition : " + binaryAddition("1010", "1101"));
    }

    static int addition(int num1, int num2) {
        return num1 + num2;
    }

    static int minAmongThree(int num1, int num2, int num3) {
        if (num1 > num2) {
            return num2;
        } else if (num2 > num3) {
            return num3;
        } else {
            return num1;
        }
    }

    static int maxAmongThree(int num1, int num2, int num3) {
        if (num1 < num2) {
            return num2;
        } else if (num2 < num3) {
            return num3;
        } else {
            return num1;
        }
    }

    static String checkEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Not Even";
        }
    }

    static int factorialNumber(int num) {
        int value = 1;
        for (int i = 1; i <= num; ++i) {
            value = value * i;
        }
        return value;

    }

    static void patter1(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    static String binaryAddition(String num1, String num2) {
        int val1 = Integer.parseInt(num1, 2);
        int val2 = Integer.parseInt(num2, 2);
        int val = val1 + val2;
        String sum = Integer.toBinaryString(val);
        return sum;
    }
}
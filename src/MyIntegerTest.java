public class MyIntegerTest {
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        else if (number > 2) {
            if (number % 2 == 0) {
                return false;
            } else {
                for (int i = 3; i < number; i += 2) {
                    if (number % i == 0) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        MyInteger integer = new MyInteger(30);


    }
}

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        if (value % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime() {
        if (value < 2) {
            return false;
        }
        else if (value > 2) {
            if (value % 2 == 0) {
                return false;
            } else {
                for (int i = 3; i < value; i += 2) {
                    if (value % i == 0) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return true;
    }

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





}

public class Recursion {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }

        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        int snm1 = sum(n - 1);
        int sn = n + snm1;
        return sn;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccurance(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccurance(arr, i + 1, key);
    }

    public static int lastOccurance(int arr[], int key, int i) {
        if (i == 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOccurance(arr, key, i - 1);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * power(x, n - 1);
    }

    public static int tilingProblem(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tilingProblem(n - 1);
        int fnm2 = tilingProblem(n - 2);
        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // single
        // int fnm1 = friendsPairing(n - 1);

        // // double
        // int fnm2 = friendsPairing(n - 2);
        // int pairWays = (n - 1) * fnm2;

        // // totWays
        // int totWays = fnm1 + pairWays;
        // return totWays;
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    public static void printBinStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }

    public static void allOccurances(int arr[], int idx, int key) {
        if (idx == arr.length) {
            return;
        }

        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }

        allOccurances(arr, idx + 1, key);

    }

    public static int addSum(int n) {
        if (n == 0)
            return 0;
        return n % 10 + addSum(n / 10);
    }

    // public static int addSum(int n) {
    // int sum = 0;
    // String num = Integer.toString(n);
    // for (int i = 0; i < num.length(); i++) {
    // int rem = n % 10;
    // n = n / 10;
    // sum = sum + rem;
    // }
    // return sum;
    // }

    public static void NaturalNo(int n) {
        if (n == 0 || n == 1) {
            System.out.print(n + " ");
            return;
        }
        NaturalNo(n - 1);
        System.out.print(n + " ");
    }

    public static void NaturalNumber(int n) {
        // int i;
        if (n == 0 || n == 1) {
            System.out.print(n + " ");
            return;
        }
        NaturalNumber(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String args[]) {
        // int n = 5;
        // printDec(n);
        // printInc(n);
        // System.out.print(fact(n));
        // System.out.print(sum(n));
        // System.out.print(fib(n) + " ");
        // int arr[] = { 4, 7, 3, 4, 5 };
        // System.out.println(isSorted(arr, 0))
        // System.out.println(firstOccurance(arr, 0, 3));
        // System.out.println(lastOccurance(arr, 7, arr.length - 1));
        // System.out.println(power(2, 3));
        // int $ = 5;
        // System.out.println($);
        // System.out.println(tilingProblem(4));
        // String str = "Rahul";
        // System.out.println(str.length());
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendsPairing(3));
        // printBinStrings(3, 0, "");
        // allOccurances(arr, 0, 4);
        System.out.println(addSum(1234));
        // NaturalNo(10);
        // NaturalNumber(10);

    }
}

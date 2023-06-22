package flairlink.primer.chapter5;

public class Method {
    public static void main(String[] args) {

        System.out.println("hello0メソッドを呼び出します");
        hello0();
        System.out.println("hello0メソッドの呼出が終了しました");

        System.out.print("\n");

        methodA();

        System.out.print("\n");

        System.out.println("hello1メソッドを呼び出します");
        hello1("湊");
        hello1("浅香");
        hello1("菅原");
        System.out.println("hello1メソッドの呼び出しが終わりました");

        System.out.print("\n");

        int a = 100;
        method0(a);

        System.out.print("\n");

        add(100, 200, "おはよう");
        add(200, 50, "こんばんわ");

        System.out.print("\n");

        int ans = add1(100, 10);
        System.out.println("100 + 10 = " + ans);
        System.out.println("30 + 70 = " + add1(30, 70));
        System.out.println("30 + 70 = " + add1(add1(10, 20), add1(30, 40)));

        System.out.print("\n");

        int returnValue = returnTest();
        System.out.println("returnTestからの戻り値は" + returnValue);

        System.out.print("\n");

        System.out.println("10 + 20 = " + duplicate(10, 20));
        System.out.println("12.8 + 53.7 = " + duplicate(12.8, 53.7));
        System.out.println("\"Hello\" + \"World\" = " + duplicate("Hello", "World"));
        System.out.println("20 + 56.9 = " + duplicate(20, 56.9) + "(double型)");

        System.out.print("\n");

        System.out.println("20 + 40 = " + duplicate1(20, 40));
        System.out.println("20 + 40 + 60 = " + duplicate1(20, 40, 60));

        System.out.print("\n");

        int[] array0 = {1, 2, 3};
        printArray(array0);

        System.out.println("\n");

        incArray(array0);
        System.out.println("array0の書き換え後の各要素を出力");
        for (int i : array0) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        int[] array1 = makeArray(3);
        System.out.println("array1の書き換え後の各要素を出力");
        for (int i : array1) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        System.out.println("コマンドライン引数の個数は" + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("コマンドライン引数の出力 : " + "args[" + i + "] = " + args[i]);
        }
    }

    public static void hello0() {
        System.out.println("hello, minato");
    }

    public static void methodA() {
        System.out.println("methodA");
        methodB();
    }

    public static void methodB() {
        System.out.println("methodB");
    }

    public static void hello1(String name) {
        System.out.println(name + "さん、こんにちは");
    }

    public static void method0(int x) {
        System.out.println("method0に送った変数xの値は" + x);
    }

    public static void add(int x, int y, String z) {
        int ans = x + y;
        System.out.println(x + "+" + y + "=" + ans);
        System.out.println(z);
    }

    public static int add1(int x, int y) {
        int returnValue = x + y;
        return returnValue;
    }

    public static int returnTest() {
        System.out.println("returnTestメソッドです 0か1を入力してください(0はtrueでif文へ、1はfalseでelse文へ)");
        int input = new java.util.Scanner(System.in).nextInt();
        if (input == 0) {
            return input;
        } else {
            return input;
        }
    }

    public static int duplicate(int x, int y) {
        return x + y;
    }

    public static double duplicate(double x, double y) {
        return x + y;
    }

    public static String duplicate(String x, String y) {
        return x + y;
    }

    public static double duplicate(int x, double y) {
        return x + y;
    }

    public static int duplicate1(int x, int y) {
        return x + y;
    }

    public static int duplicate1(int x, int y, int z) {
        return x + y + z;
    }

    public static void printArray(int[] array) {
        System.out.println("array0の各要素を出力");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void incArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }

    public static int[] makeArray(int size) {
        int[] newArray = new int[size];
        System.out.println("array1の各要素を出力");
        for (int i : newArray) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }
}

package flairlink.primer.chapter6.calcapp.main;

public class Calc {
    public static void main(String[] args) {
        System.out.println("2数の和・差・積・商・余りを計算します");
        System.out.println("計算したい2つの整数を入力してください");
        int a = new java.util.Scanner(System.in).nextInt();
        int b = new java.util.Scanner(System.in).nextInt();
        int total = flairlink.primer.chapter6.calcapp.logics.CalcLogic.tasu(a, b);
        int delta = flairlink.primer.chapter6.calcapp.logics.CalcLogic.hiku(a, b);
        int times = flairlink.primer.chapter6.calcapp.logics.CalcLogic.kakeru(a, b);
        int divide = flairlink.primer.chapter6.calcapp.logics.CalcLogic.waru(a, b);
        int reminder = flairlink.primer.chapter6.calcapp.logics.CalcLogic.amari(a, b);
        System.out.println(a + "と" + b + "を足すと" + total + "、引くと" + delta + "、かけると" + times + "、割った商は" + divide + "、割った余りは" + reminder);
    }
}
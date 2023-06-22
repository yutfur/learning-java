package flairlink.primer.chapter6.calcapp.main;
import flairlink.primer.chapter6.calcapp.logics.CalcLogic;

public class Calc_1 {
    public static void main(String[] args) {
        System.out.println("2数の和・差・積・商・余りを計算します");
        System.out.println("計算したい2つの整数を入力してください");
        int a = new java.util.Scanner(System.in).nextInt();
        int b = new java.util.Scanner(System.in).nextInt();
        int total = CalcLogic.tasu(a, b);
        int delta = CalcLogic.hiku(a, b);
        int times = CalcLogic.kakeru(a, b);
        int divide = CalcLogic.waru(a, b);
        int reminder = CalcLogic.amari(a, b);
        System.out.println(a + "と" + b + "を足すと" + total + "、引くと" + delta + "、かけると" + times + "、割った商は" + divide + "、割った余りは" + reminder);
    }
}

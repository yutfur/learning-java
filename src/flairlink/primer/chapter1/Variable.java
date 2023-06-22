package flairlink.primer.chapter1;

public class Variable {
    public static void main(String[] args) {
        short a;
        a = 2;
        System.out.println(a);

        System.out.print("\n");

        int b;
        b = 24;
        System.out.println(b);

        System.out.print("\n");

        double c = -3.14;
        System.out.println(c);

        System.out.print("\n");

        String name = "I wanna play tennis.";
        System.out.println(name);
        System.out.println(9); // 数値や真偽値はそのままの表記でデータとして扱える
        System.out.println(true);

        System.out.print("\n");

        boolean result = true;
        System.out.println(result);

        System.out.print("\n");

        int x = 8;
        int y = x * x - 2 * x + 24; // 代入(入力)するデータに演算子を使うことは可能(なのでprintlnの中でデータを入力するときも可能)
        System.out.println(y);
        System.out.println(x + y);

        System.out.print("\n");

        int d = 8;
        int f = x * x - 2 * x + 24; // 変数宣言の文は並べても良い
        System.out.println(f);
        System.out.println(d + f);

        System.out.print("\n");

        int z = 24;
        System.out.println("値の出力" + z); // 文字データと数字データor変数データの同行での出力
        System.out.println(
                "値の出力"
                        + 3); // 数字データは”で囲まなくても普通に出力される(囲まない場合は文字や文字列データとして認識されてない、数字データはそのままで数字データとしてそのまま出力できる)
        System.out.println("値の出力3"); // この場合でも上記と同じ出力になるので”で囲めば文字・文字列データとして認識できる
        System.out.println(3);
        System.out.println("値の出力" + 31 + 31); // この場合は31+31がただの羅列になる
        System.out.println(
                "値の出力"
                        + (31
                                + 31)); // ()で囲むことにより上記の問題は解決する。()の内部の処理(演算・評価)が優先的に実行されて結果へ置換された後に()が無効化される＝外れるということだろうが。
        System.out.println(
                "値の出力"
                        + ("値の出力")); // この場合は上記と違って()内部に処理がないので()が働いていない。すべき処理がないので処理しないという処理を実行された結果()が無効化されたとも考えられる。
        System.out.println(31 + 31); // この場合は31+31が計算される

        System.out.print("\n");

        /*
        変数の初期化で始めても再代入＝上書きは可能(intいらない)
        ただし、古い値は消滅する
        */
        int myAge0 = 24;
        System.out.println("私の年齢は" + myAge0);
        myAge0 = 31;
        System.out.println("...いや、本当の年齢は" + myAge0);
        int num = 24;
        System.out.println(num);
        System.out.println(num += 6);
        System.out.println(
                num); // println中で代入演算子による演算をして変数の値が変わる＝違う値が変数に代入されると変数が上書きされてそれ以降その変数の値のまま進行する。(上から下への処理)

        System.out.print("\n");

        final double pi = 3.14; // 定数の利用
        int r = 5;
        System.out.println("半径" + r + "cmのパイの面積は、" + r * r * pi);
        // 上記が可能だということはprintlnの()の中にはデータ＝値を入力するということか(＝変数のデータ入力と同じように書いていい)、そしてそれを出力する(出力するデータの入力)
        System.out.println("パイの半径を倍にします");
        r = 5 * 2;
        System.out.println("半径" + r + "cmのパイの面積は、" + r * r * pi);
    }
}

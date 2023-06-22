package flairlink.primer.chapter2;

public class ExpressionOperator {
    public static void main(String[] args) {

        System.out.println("私の好きな記号は二重引用符(\")と\\と'です");
        System.out.println('\'');

        System.out.print("\n");

        String a0 = "春";
        System.out.println(a0);
        a0 += "風";
        System.out.println(a0);

        System.out.print("\n");

        int x = 69;
        System.out.println(x /= 3);

        System.out.print("\n");

        int a1 = 100;
        System.out.println(a1);
        a1--;
        System.out.println(a1);

        System.out.print("\n");

        int b = 30;
        System.out.println(b);
        ++b;
        System.out.println(b);

        System.out.print("\n");

        int b1 = 40;
        System.out.println(b1++);
        System.out.println(++b1);
        /*
        上記の結果から鑑みるに()の中でもインクリメント/デクリメント演算子は使わないほうがいいかも。
        それらの演算子使うなら上書きの際に使うほうがいい。それで上書きした後にその上書きした変数を入力するというようにした方がいい。
        */

        System.out.print("\n");

        float e = 3; // 整数型のデータ3をfloat型に変換してからfloat型の変数eに代入
        System.out.println(e);
        double f = e; // float型の変数(データ)eをdouble型に変換してからdouble型の変数fに代入
        System.out.println(f);

        System.out.print("\n");

        // 右記はコンパイルエラー起こる int i = 3.2(小数型のデータ);
        int i = (int)3.2; // 小数型のデータを強制的に整数型のデータに変換してから整数型の変数iに代入(強制的な型変換)
        System.out.println(i);
        byte g = (byte)9999; // int型データを強制的にbyte型データに変換してからbyte型の変数gに代入(強制的な型変換)
        System.out.println(g);

        System.out.print("\n");

        System.out.println(5.0 / 2); // double型とint型の演算結果はdouble型に(int型をdouble型に変換してから演算)
        System.out.println("私の年齢は" + 23 ); // String型とint型(数値型)の演算結果はString型に(int型をString型に変換してから演算)
        System.out.println("100 + 10 = " + (100 + 10));

        System.out.print("\n");

        String name = "yuto";
        System.out.print("私の名前は");
        System.out.print(name);
        System.out.println("です");
        System.out.println("よろしく");

        System.out.print("\n");

        int j = 5;int k = 3;
        int m = Math.max(j,k);
        System.out.println(j + "と" + k + "とで大きい方は" + m);

        System.out.print("\n");

        String age0 = "31";
        int n = Integer.parseInt(age0);
        System.out.println("あなたは来年" + (n + 1) + "歳になりますね");

        System.out.print("\n");

        int r = new java.util.Random().nextInt(90);
        System.out.println("あなたは多分、" + r + "歳ですね？");

        System.out.print("\n");

        System.out.println("あなたの名前を入力してください");
		String name1 = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		int age1 = new java.util.Scanner(System.in) .nextInt();
		System.out.println("ようこそ、" + age1 + "歳の" + name1 + "さん");
    }
}

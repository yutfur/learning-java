package flairlink.primer.chapter3;

public class ControlFlowStatements {
    public static void main(String[] args) {

        boolean isSunny = new java.util.Random().nextBoolean();
        if (isSunny) {
            System.out.println("晴れているので、洗濯をして、散歩に行きます");
        } else {
            System.out.println("雨が降っているので、部屋でDVDを見ます");
        }

        System.out.print("\n");

        boolean isClose = new java.util.Random().nextBoolean();
        while (isClose) {
            System.out.println("ドアが閉まっているので、ドアをノックして1分待つ");
            isClose = new java.util.Random().nextBoolean();
        }
        System.out.println("ドアが開いているので、トイレに入る");

        System.out.print("\n");

        boolean result = true;
        if (result) { // 制御構文の()には条件式を入れると言うよりも真偽値を入れるといったほうが正しい、それによって処理フローを変える
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.print("\n");

        boolean isOverTeenage;
        int myAge = 24;
        isOverTeenage = (myAge >= 10);
        System.out.println(isOverTeenage);

        /*
        String str = "夕日";
        String msg = "朝日";
        if (str.equals("夕日")) or (str.equals(msg)) {}
        */

        boolean a;
        int a0 = 23;
        a = (a0 >= 20);
        System.out.println(a);

        boolean b;
        int b0 = 46;
        b = (b0 == 46);
        System.out.println(b);
        b = (b0 != 46);
        System.out.println(b);

        boolean c;
        String c0 = "斉藤";
        c = (c0.equals("斉藤"));
        System.out.println(c);

        boolean d;
        int d0 = 41;
        String d1 = "古田";
        d = (d0 >= 40 && d1.equals("古田"));
        System.out.println(d);
        d = (d0 <= 40 || d1.equals("古館"));
        System.out.println(d);

        /*
        18歳以上、かつ5月生まれ
        (age >= 18 && birthMonth == 5);
        */
        /*
        名字が斉藤、または斎藤
        (name.equals("斉藤") || name.equals("斎藤"));
        */
        /*
        hpが100未満かつpoisonがfalse、またはhpが100以上かつposionがtrue
        ((hp < 100 && poison == false) || (hp >= 100 && poison == true));
        */

        /*
        if (!(age == 10)) {}
        */

        boolean canDrink;
        int age = 21;
        if (age >= 20) {
            canDrink = true;
        } else {
            canDrink = false;
        }
        System.out.println(canDrink);

        if (age >= 20) {
            canDrink = true;
        }

        System.out.print("\n");

        char size;
        int height = 171;
        if (height >= 170) {
            size = 'L';
        } else if (height >= 160) {
            size = 'M';
        } else if (height >= 150) {
            size = 'S';
        } else {
            size = '?';
        }
        System.out.println("サイズは" + size);

        System.out.print("\n");

        System.out.println("あなたの運勢を占います");
        int fortune = new java.util.Random().nextInt(4);
        fortune++;
        if (fortune == 1) {
            System.out.println("大吉");
        } else if (fortune == 2) {
            System.out.println("中吉");
        } else if (fortune == 3) {
            System.out.println("吉");
        } else {
            System.out.println("凶");
        }

        System.out.print("\n");

        // 上記の書き換え
        System.out.println("あなたの運勢を占います");
        switch (fortune) {
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("吉");
                break;
            default:
                System.out.println("凶");
        }

        System.out.print("\n");

        System.out.println("あなたの運勢を占います");
        int fortune0 = new java.util.Random().nextInt(5);
        fortune0++;
        System.out.println("あなたの運気番号は" + fortune0 + "なので...");
        switch (fortune0) {
            case 1:
                System.out.println("大吉"); // ここにbreak入れない
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("吉");
                break;
            default:
                System.out.println("凶");
        }

        System.out.print("\n");

        System.out.println("あなたの運勢を占います");
        int fortune1 = new java.util.Random().nextInt(5) + 1;
        switch (fortune1) {
            case 1:
            case 2:
                System.out.println("いいね！");
                break;
            case 3:
                System.out.println("普通です");
                break;
            case 4:
            case 5:
                System.out.println("うーん...");
                break;
        }

        System.out.print("\n");

        int temp = 28;
        while (temp > 25) {
            temp--;
            System.out.println("温度を1度下げました");
        }

        System.out.print("\n");

        int temp0 = 27;
        do {
            temp0--;
            System.out.println("温度を1度下げました");
        } while (temp0 > 25);

        System.out.print("\n");

        System.out.println("乱数とdo-whileの組み合わせ");
        boolean isRandom;
        do {
            int r0 = new java.util.Random().nextInt(4);
            r0++;
            System.out.println("乱数は" + r0);
            System.out.println("繰り返す？ y/n");
            String str = new java.util.Scanner(System.in).nextLine();
            if (str.equals("y")) {
                isRandom = true;
            } else {
                isRandom = false;
            }
        } while (isRandom);

        System.out.print("\n");

        for (int i = 0; i < 10; i++) {
            System.out.println("現在" + (i + 1) + "周目");
        }

        System.out.print("\n");

        for (int i = 0; i < 10; ) {
            System.out.println("現在" + (i + 1) + "周目");
            i++;
        }

        System.out.print("\n");

        // ループ変数を1からスタートする
        for (int i = 1; i < 10; i++) {
            System.out.println("おはよう");
        }

        System.out.print("\n");

        // ループ変数を2ずつ増やす
        for (int i = 0; i < 10; i += 2) {
            System.out.println("こんにちは");
        }

        System.out.print("\n");

        // ループ変数を10から1ずつ1まで減らしていく
        for (int i = 10; i > 0; i--) {
            System.out.println("こんばんわ");
        }

        System.out.print("\n");

        int height1 = 171;
        double eyeSight1 = 0.9;
        if (height1 >= 170) {
            if (eyeSight1 >= 1.0) {
                System.out.println("合格");
            } else {
                System.out.print("不合格");
            }
        } else {
            System.out.println("不合格");
        }

        System.out.println("\n");

        // 3の倍数の出力
        int i = 1;
        do {
            if (i % 3 == 0) {
                System.out.println(i + "は3の倍数");
            }
            i++;
        } while (i < 100);

        System.out.print("\n");

        // 九九の出力
        System.out.println("九九表");
        for (int j = 1; j < 10; j++) {
            for (int k = 1; k < 10; k++) {
                System.out.print((j * k) + " ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int j = 0; j < 10; j++) {
            if (j == 3) {
                break;
            }
            System.out.println(j);
        }

        System.out.print("\n");

        for (int j = 0; j < 10; j++) {
            if (j == 3) {
                continue;
            }
            System.out.println(j);
        }

        System.out.print("\n");

        // while (true) {} 無限ループ
        // for (;;) {} 無限ループ

        // 無限ループ。やりたいときはbreak文をコメントアウトすればいい。
        while (true) {
            System.out.println("無限ループ");
            break;
        }

        System.out.print("\n");

        // 無限ループ。やりたいときはbreak文をコメントアウトすればいい。
        for (; ; ) {
            System.out.println("無限ループ");
            break;
        }
    }
}

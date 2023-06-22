package flairlink.primer.chapter4;

public class Array {
    public static void main(String[] args) {

        int[] scores0 = new int[5];
        System.out.println("配列変数scores0の要素数は" + scores0.length);
        scores0[1] = 30;
        System.out.println("scores0[1] = " + scores0[1]);

        System.out.print("\n");

        String str = "これはテスト文です";
        System.out.println("String型変数strに格納されている文字列データの文字数は" + str.length());

        System.out.print("\n");

        int[] scores = {20, 30, 40, 50, 80};
        System.out.println("配列変数scoresの要素は20, 30, 40, 50, 80");
        System.out.println("配列変数scoresの要素数は" + scores.length);
        int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
        int avg = sum / scores.length;
        System.out.println("配列変数scoresの要素の合計は" + sum);
        System.out.println("配列変数scoresの要素の平均は" + avg);

        System.out.print("\n");

        System.out.println("配列変数scoresの各要素を出力");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        System.out.print("\n");

        // 拡張for文
        System.out.print("配列scoresの各要素の値は");
        for (int i : scores) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        int[] scores2 = {20, 30, 40, 50, 80};
        System.out.print("配列変数scores2の要素の値は");
        for (int i = 0; i < scores2.length; i++) {
            System.out.print(scores2[i] + " ");
        }
        System.out.print("\n");
        System.out.println("配列変数scores2の要素数は" + scores2.length);
        int sum1 = 0;
        int count1 = 0;
        for (int i = 0; i < scores2.length; i++) {
            System.out.println("配列変数scores2の" + i + "番目の要素の値は" + scores2[i]);
            sum1 += scores2[i];
            if (scores2[i] >= 50) {
                count1++;
            }
        }
        int avg1 = sum1 / scores2.length;
        System.out.println("配列変数scores2の要素の合計は" + sum1);
        System.out.println("配列変数scores2の要素の平均は" + avg1);
        System.out.println("配列変数scores2において値が50以上の要素の数は" + count1 + "つ");

        System.out.print("\n");

        int[] seq = new int[10];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = new java.util.Random().nextInt(4); // 各要素へ塩基配列をランダムに生成
            switch (seq[i]) { // 各要素へ生成した塩基配列の記号を表示
                case 0:
                    System.out.print("A ");
                    break;
                case 1:
                    System.out.print("T ");
                    break;
                case 2:
                    System.out.print("G ");
                    break;
                default:
                    System.out.print("C ");
            }
        }

        System.out.print("\n");

        // 各要素へ生成した塩基配列の記号を表示
        char[] base = {'A', 'T', 'G', 'C'};
        for (int i = 0; i < seq.length; i++) {
            seq[i] = new java.util.Random().nextInt(4);
            System.out.print(base[seq[i]] + " ");
        }

        System.out.print("\n");

        // 各要素へ生成した塩基配列の記号を表示
        for (int i = 0; i < seq.length; i++) {
            seq[i] = new java.util.Random().nextInt(4);
            int baseType = seq[i];
            char baseChar = base[baseType];
            System.out.print(baseChar + " ");
        }

        System.out.println("\n");

        int[] arrayA = {1, 2, 3};
        int[] arrayB;
        arrayB = arrayA;
        arrayB[0] = 100;
        System.out.println("arrayA[0] = " + arrayA[0]);
        System.out.println("配列変数arrayAをそのまま出力すると..." + arrayA);
        System.out.println("配列変数arrayBをそのまま出力すると..." + arrayB);
        // arrayA = null; 参照先を切る

        System.out.print("\n");

        // 多次元配列
        int[][] scores3 = new int[2][3];
        scores3[0][0] = 20;
        scores3[0][1] = 30;
        scores3[0][2] = 40;
        scores3[1][0] = 50;
        scores3[1][1] = 60;
        scores3[1][2] = 70;
        System.out.println("scores3[1][1] = " + scores3[1][1]);

        System.out.print("\n");

        int[][] scores4 = {{40, 50, 60}, {80, 60, 70}};
        System.out.println("配列変数scores4に対する行配列の要素数は" + scores4.length);
        System.out.println("行配列の要素scores4[0]に対する列配列の要素数は" + scores4[0].length);
    }
}

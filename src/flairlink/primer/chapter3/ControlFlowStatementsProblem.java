package flairlink.primer.chapter3;

public class ControlFlowStatementsProblem {
    public static void main(String[] args) {
        // weight == 60
        // (age1 + age 2)*2 > 60;
        // (age % 2) == 1
        // name.equals("湊")

        int isHungry = 1;
        String food = "りんご";
        System.out.println("こんにちは");
        if (isHungry == 0) {
            System.out.println("お腹いっぱいです");
        } else {
            System.out.println("はらぺこです");
        }
        if (isHungry == 1) {
            System.out.println(food + "をいただきます");
            System.out.println("ごちそうさまでした");
        }

        System.out.print("\n");

        System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
        boolean retry;
        do {
            int selected = new java.util.Scanner(System.in).nextInt();
            switch (selected) {
                case 1:
                    System.out.println("検索します");
                    retry = false;
                    break;
                case 2:
                    System.out.println("登録します");
                    retry = false;
                    break;
                case 3:
                    System.out.println("削除します");
                    retry = false;
                    break;
                case 4:
                    System.out.println("変更します");
                    retry = false;
                    break;
                default:
                    System.out.println("無効な数字です。数字を再選択してください。");
                    retry = true;
                    break;
            }
        } while (retry);

        System.out.print("\n");

        System.out.println("【数あてゲーム】");
        int ans = new java.util.Random().nextInt(10);
        for (int i = 0; i < 5; i++) {
            System.out.println("0~9の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();
            if (num == ans) {
                System.out.println("アタリ!");
                break;
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}

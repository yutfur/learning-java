package flairlink.primer.chapter2;

public class ExpressionOperatorProblem {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        String ans = "x+yは" + (x + y);
        System.out.println(ans);

        System.out.print("\n");

        // 1.false 2.true 3.false 4.true 5.true 6.false 7.true

        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        fortune++;
        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("1:大吉 2:中吉 3:吉 4:凶");

    }
}

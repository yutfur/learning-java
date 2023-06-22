package flairlink.primer.chapter4;

public class ArrayProblem {
    public static void main(String[] args) {

        // int[] points = new int[4];
        // double[] weight = new double[5];
        // boolean[] answers = new boolean[3];
        // String[] names = new String[3];

        int[] moneyList = {121902, 8302, 55100};
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println("配列変数moneyListの" + (i + 1) + "番目の要素の値は" + moneyList[i]);
        }

        System.out.print("\n");

        for (int m : moneyList) {
            System.out.println(m);
        }
        
        System.out.print("\n");

        int[] numbers = {3, 4, 9};
        System.out.println("1桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (input == numbers[i]) {
                System.out.println("アタリ！");
                break;
            }
        }

        System.out.print("\n");

        int[] numbers1 = {3, 4, 9};
        System.out.println("1桁の数字を入力してください");
        int input1 = new java.util.Scanner(System.in).nextInt();
        if (input1 == numbers1[0] || input1 == numbers1[1] || input1 == numbers1[2]) {
            System.out.println("アタリ！");
        } else {
            System.out.println("ハズレ！");
        }
    }
}

package flairlink.primer.chapter5;

public class MethodProblem {
    public static void main(String[] args) {

        introduceOneself();

        System.out.print("\n");

        String title = "テスト";
        String address = "xxx@zzzz.com";
        String text = "これはテストメールです";
        email(title, address, text);

        System.out.print("\n");

        email(address, text);

        System.out.print("\n");

        double triangleArea = calcTriangleArea(10.0, 5.0);
        System.out.println("三角形の底辺の高さが10.0cm、高さが5.0cmの三角形の面積は" + triangleArea + "cm^2");

        System.out.print("\n");

        double circleArea = calcCircleArea(5.0);
        System.out.println("半径5.0cmの円の面積は" + circleArea + "cm^2");
    }

    public static void introduceOneself() {
        String name = "yuto";
        int age = 24;
        double height = 160.0;
        char zodiac = '子';
        System.out.println("私の名前は" + name + "です");
        System.out.println("年齢は" + age + "です");
        System.out.println("身長は" + height + "です");
        System.out.println("干支は" + zodiac + "です");
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + " に、以下のメールを送信しました");
        System.out.println("件名: " + title);
        System.out.println("本文: " + text);
    }

    public static void email(String address, String text) {
        System.out.println(address + " に、以下のメールを送信しました");
        System.out.println("件名:無題");
        System.out.println("本文:" + text);
    }

    public static double calcTriangleArea(double bottom, double height) {
        double triangleArea = bottom * height / 2;
        return triangleArea;
    }

    public static double calcCircleArea(double radius) {
        double circleArea = radius * radius * 3.14;
        return circleArea;
    }
}

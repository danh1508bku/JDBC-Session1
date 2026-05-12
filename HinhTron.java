import java.util.Scanner;
public class HinhTron {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;

        System.out.print("Nhập bán kính hình tròn: ");
        radius = input.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Diện tích hình tròn là: %.2f", area);
    }
}

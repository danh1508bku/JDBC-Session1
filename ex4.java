import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        float width = input.nextFloat();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        float height = input.nextFloat();

        float area =  width * height;
        float perimeter = 2 * (width + height);

        System.out.printf("Diện tích: %.2f", area);
        System.out.printf("\nChu vi: %.2f", perimeter);
    }
}

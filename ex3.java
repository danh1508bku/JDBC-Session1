import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tử số của phân số thứ nhất: ");
        int t1 = input.nextInt();
        System.out.print("Nhập mẫu số của phân số thứ nhất: ");
        int m1 = input.nextInt();

        System.out.print("Nhập tử số của phân số thứ hai: ");
        int t2 = input.nextInt();
        System.out.print("Nhập mẫu số của phân số thứ hai: ");
        int m2 = input.nextInt();

        System.out.printf("Tổng của 2 phân số là: %d/%d",(t1*m2+t2*m1),(m1*m2));
    }
}

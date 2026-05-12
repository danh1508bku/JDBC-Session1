import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất (firstNumber): ");
        int firstNumber = input.nextInt();
        System.out.print("Nhập số thứ hai (secondNumber):");
        int secondNumber = input.nextInt();

        System.out.print("\n--- Kết quả ---");
        System.out.printf("\nfirstNumber = %d",  firstNumber);
        System.out.printf("\nsecondNumber = %d",  secondNumber);
        System.out.printf("\nTổng = %d", firstNumber + secondNumber);
        System.out.printf("\nHiệu = %d", firstNumber - secondNumber);
        System.out.printf("\nTích = %d", firstNumber * secondNumber);
        System.out.printf("\nThương =  %d", firstNumber / secondNumber);
        System.out.printf("\nPhần dư = %d", firstNumber % secondNumber);
    }
}

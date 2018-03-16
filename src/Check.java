import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean kt = false;
        System.out.println("Mời bạn nhập năm cần tra cứu: ");
        int year = scanner.nextInt();
        boolean check4 = year % 4 == 0;
        if (check4) {
            boolean check100 = year % 100 == 0;
            if (check100) {
                boolean check400 = year % 400 == 0;
                if (check400) {
                    kt = true;
                }
            } else {
                kt = true;
            }
        }

        if (kt) {
            System.out.printf("Năm nhuận", year);
        } else {
            System.out.printf("Năm không nhuận", year);
        }
    }
}

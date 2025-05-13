package Bai5;

import java.util.Scanner;

public class Java {
    public  static void  main (String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Nhập phân số thứ 1
        System.out.println("Phân số 1: ");
        int tu1 = scanner.nextInt();
        System.out.println("Mẫu số 1:");
        int mau1 = scanner.nextInt();

//        Nhập phân số thứ 2
        System.out.print("Phân số 2: ");
        int tu2 = scanner.nextInt();
        System.out.print("Mẫu số 2: ");
        int mau2 = scanner.nextInt();

//        Tính tổng tử và mẫu
        int tuSoTong = tu1 * mau2 + tu2 * mau1;
        int mauSoTong = mau1 * mau2;

        System.out.println("Tổng hai phân số là: " + tuSoTong + "/" + mauSoTong);
    }
}

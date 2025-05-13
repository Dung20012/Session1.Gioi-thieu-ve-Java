package Bai6;

import java.util.Scanner;

public class Java {
    public static void  main (String[] args){
        Scanner scanner = new Scanner(System.in);

//        Khai báo biến
        double width, height, area, circumference;
//        Nhập chiều rong và cao
        System.out.println("Chiều rộng của hình chữ nhật: ");
        width = scanner.nextDouble();
        System.out.println("Chiều cao hình chữ nhật: ");
        height =scanner.nextDouble();
//        Tính diện tích chu vi
        area = width * height;
        circumference = 2 * (width + height);
//        Kết quả
        System.out.println("Diện tích:" + area);
        System.out.println("Chu vi: " + circumference);
    }
}

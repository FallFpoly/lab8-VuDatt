

package com.mycompany.lab8;


import java.util.Scanner;

public class bai4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== MENU XPOLY =====");
            System.out.println("1. Tinh tong cac so");
            System.out.println("2. Tim so nho nhat");
            System.out.println("3. Tim so lon nhat");
            System.out.println("4. Viet hoa chu cai dau moi tu");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    tinhTong();
                    break;
                case 2:
                    timMin();
                    break;
                case 3:
                    timMax();
                    break;
                case 4:
                    vietHoaChuCaiDau();
                    break;
                case 0:
                    System.out.println("Tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
            }

        } while (choice != 0);

        sc.close();
    }
    public static void tinhTong() {
        double[] arr = nhapMang();
        double tong = bai2.sum(arr);
        System.out.println("Tong la: " + tong);
    }

    public static void timMin() {
        double[] arr = nhapMang();
        double min = bai2.min(arr);
        System.out.println("So nho nhat la: " + min);
    }

    public static void timMax() {
        double[] arr = nhapMang();
        double max = bai2.max(arr);
        System.out.println("So lon nhat la: " + max);
    }

    public static void vietHoaChuCaiDau() {
        System.out.print("Nhap chuoi can viet hoa: ");
        String input = sc.nextLine();
        String result = bai3.toUpperFirstChar(input);
        System.out.println("Chuoi sau khi viet hoa: " + result);
    }
    public static double[] nhapMang() {
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }
        sc.nextLine();   
        return arr;
    }
}

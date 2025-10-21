

package com.mycompany.lab8;

import java.util.Scanner;


public final class bai1 {

    public static final double sum(double... x) {
        double tong = 0;
        for (double n : x) {
            tong += n;
                    
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();

        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }
        double tong = bai1.sum(arr);
        System.out.println("Tong la: " + tong);
}
}

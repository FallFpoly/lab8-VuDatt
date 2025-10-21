

package com.mycompany.lab8;


import java.util.Scanner;

public final class bai2 {

    
    public static final double sum(double... x) {
        double total = 0;
        for (double n : x) {
            total += n;
        }
        return total;
    }

    
    public static final double min(double... x) {
        
        double min = x[0];
        for (double n : x) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    
    public static final double max(double... x) {
       
        double max = x[0];
        for (double n : x) {
            if (n > max) {
                max = n;
            }
        }
        return max;
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

        double tong = bai2.sum(arr);
        double nhoNhat = bai2.min(arr);
        double lonNhat = bai2.max(arr);

        System.out.println("Tong la: " + tong);
        System.out.println("So nho nhat la: " + nhoNhat);
        System.out.println("So lon nhat la: " + lonNhat);

        sc.close();
    }
}

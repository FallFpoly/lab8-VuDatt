

package com.mycompany.lab8;

import java.util.Scanner;


public final class bai3 {

    
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
     public static final String toUpperFirstChar(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        
        String[] words = s.split(" ");

        
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                char firstChar = words[i].charAt(0);
                String upperFirstChar = String.valueOf(firstChar).toUpperCase();
                words[i] = upperFirstChar + words[i].substring(1);
            }
        }

        
        String ss = String.join(" ", words);
        return ss;
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
        sc.nextLine();
        
        double tong = bai3.sum(arr);
        double nhoNhat = bai3.min(arr);
        double lonNhat = bai3.max(arr);

        System.out.println("Tong la: " + tong);
        System.out.println("So nho nhat la: " + nhoNhat);
        System.out.println("So lon nhat la: " + lonNhat);
        System.out.print("Nhap chuoi can viet hoa: ");
        String input = sc.nextLine();
        String result = bai3.toUpperFirstChar(input);
        System.out.println("Chuoi sau khi viet hoa: " + result);

        sc.close();
    }
}
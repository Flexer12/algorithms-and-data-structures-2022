package ru.mirea.practice.s21K0576.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int arr_size = sc.nextInt();

        int sum = 0;
        int elem_max, elem_min;
        int[] arr = new int[arr_size];
        System.out.print("Значения: ");
        for (int a = 0; a < arr.length; ++a) {
            arr[a] = sc.nextInt();
            sum += arr[a];
        }

        sum = 0;
        int a = 0;
        do {
            sum += arr[a];
            ++a;
        } while(a < arr.length);

        System.out.printf(
                "Сумма через do while: %d\n",
                sum
        );

        a = 0; sum = 0;
        elem_min = arr[a];
        elem_max = arr[a];
        while (a < arr.length) {
            sum += arr[a];
            if (arr[a] < elem_min) {
                elem_min = arr[a];
            }
            if (arr[a] > elem_max) {
                elem_max = arr[a];
            }
            ++a;
        }

        System.out.printf(
                "Сумма через while: %d.\nMax: %d. Min: %d\n",
                sum,
                elem_max, elem_min
        );
    }
}
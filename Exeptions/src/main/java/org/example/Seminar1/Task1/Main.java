package org.example.Task1;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума,
метод возвращает -1 в качестве кода ошибки, иначе - длину массива.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int result = arrayLenghtCheck(array, n);
        System.out.println(result);
    }

    public static int arrayLenghtCheck(int[] array, int n) {
        if (array.length < 10) {
            return -1;
        }
        else {
            return array.length;
        }

    }


}
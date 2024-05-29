package org.example.Task3;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
 */

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1,}, {1,1,1}, {0,0,0}};
        int sum = sumElements(matrix);
        System.out.println(sum);
    }

    public static int sumElements(int[][] matrix){
        int n = matrix.length;
        for (int[] row: matrix){
            if(row.length != n){
                throw new RuntimeException("Количество строк не равно количеству столбцов");
            }
        }
        for (int[] row: matrix){
            for(int elem: row){
                if(elem != 0 && elem != 1){
                    throw new RuntimeException("Массив должен содержать только 0 или 1");
                }
            }
        }
        int sum = 0;
        for (int[] row: matrix){
            for(int elem: row){
                sum += elem;
            }
        }
        return sum;
    }
}

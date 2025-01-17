package org.example.Task4;
/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными
массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только
значение 0 или 1. Если нарушается одно из условий, метод должен вернуть код ошибки.
Программа должна корректно обработать код ошибки и вывести соответствующее сообщение
пользователю. Сравнить такой вариант обработки исключений с предыдущим.
Какое преимущество у исключений перед кодами ошибок вы можете назвать в данном случае?
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,0,}, {1,1,1}, {0,0,0}};
        int result = sumElements(matrix);
        if(result == -1){
            System.out.println("Количество строк не равно количеству столбцов");
        }
        else if(result == -2){
            System.out.println("Массив должен содержать только 0 или 1");
        }
        else{
            System.out.println("Сумма всех элементов: " + result);
        }
    }

    public static int sumElements(int[][] matrix){
        int n = matrix.length;
        for (int[] row: matrix){
            if(row.length != n){
                return -1;
            }
        }
        for (int[] row: matrix){
            for(int elem: row){
                if(elem != 0 && elem != 1){
                    return -2;
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

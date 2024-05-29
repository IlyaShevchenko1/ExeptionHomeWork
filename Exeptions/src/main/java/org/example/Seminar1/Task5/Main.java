package org.example.Task5;

/*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
целочисленный одномерный массив. Метод должен пройтись по каждому элементу и проверить,
что он не равен null. А теперь реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, null, 2, null, 3, null};
        List<Integer> nullElements = checkArray(array);
        if(nullElements.size() > 0){
            System.out.println("Массив содержит пустые элементы на позициях " + nullElements);
        }
        else{
            System.out.println("Пустых элементов нет");
        }
    }

    public static List<Integer> checkArray(Integer[] array){
        List<Integer> nullElem = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if(array[i] == null){
                nullElem.add(i);
            }
        }
    return nullElem;
    }
}

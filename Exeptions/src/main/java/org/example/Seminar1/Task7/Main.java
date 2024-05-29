package org.example.Task7;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{1,2,3},{1,2,3}};
        if(checkArray(array)){
            System.out.println("Количество строк и столбцов совпадает");
        }
        else{
            System.out.println("Количество строк и столбцов не совпадает");
        }
    }

    public static boolean checkArray(int[][] array){
        int rows = array.length;
        if(rows == 0){
            return true;
        }
        for(int i = 0; i < array.length; i++){
            if(array[i].length != rows){
                return false;
            }
        }
        return true;
    }
}

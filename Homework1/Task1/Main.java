package Homeworks.Homework1.Task1;
//  Напишите программу, которая использует Stream API для обработки списка чисел.
//  Программа должна вывести на экран среднее значение всех четных чисел в списке.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List <Integer> list =  Arrays.asList(100,100,100,100,200,200,200,200);
        printList(list);
        average(list);

    }

    /**
     * Метод подсчета среднего значения
     * @param list список чисел
     */
    public static void average (List<Integer> list) {
        double average = list.stream()
                        .mapToDouble(Integer::doubleValue)
                                .average()
                                        .orElse(0.0);
        System.out.println("\nСреднее значение списка: " + average + "\n");
    }

    /**
     * Метод печати значений в списке
     * @param list - список значений
     */
    public static void printList(List<Integer> list){
        String result = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(result);
    }
}


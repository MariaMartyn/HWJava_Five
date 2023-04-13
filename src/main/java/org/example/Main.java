package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.example.HeapSort.printArray;

public class Main {
    public static void main(String[] args) {
    //phoneBook();
    heapSortTask();
    }
/**
    Задача 1. * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь
    * несколько телефонов.
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */
    public static void phoneBook() {
        Phonebook people = new Phonebook();
        people.addPerson("Иван", "Иванов");
        people.addPerson("Светлана", "Петрова");
        people.addPerson("Кристина", "Белова");
        people.addPerson("Анна", "Мусина");
        people.addPerson("Анна", "Крутова");
        people.addPerson("Иван", "Юрин");
        people.addPerson("Петр", "Лыков");
        people.addPerson("Павел", "Чернов");
        people.addPerson("Петр", "Чернышов");
        people.addPerson("Мария", "Федорова");
        people.addPerson("Марина", "Светлова");
        people.addPerson("Мария", "Савина");
        people.addPerson("Мария", "Рыкова");
        people.addPerson("Марина", "Лугова");
        people.addPerson("Анна", "Владимирова");
        people.addPerson("Иван", "Мечников");
        people.addPerson("Петр", "Петин");
        people.addPerson("Иван", "Ежов");


        System.out.println(people.getPhonebook());

        }

    /**
     * Задача 2. Реализовать алгоритм пирамидальной сортировки (HeapSort).
     */
    public static void heapSortTask() {
        int arr[] = {60, 28, 39, 5, 78, 9, 4, 69};
        System.out.println("Первоначальный список: ");
        printArray(arr);
        int n = arr.length;
        HeapSort ob = new HeapSort();
        ob.sort(arr);
        System.out.println();
        System.out.println("Отсортированный список: ");
        printArray(arr);

    }

}
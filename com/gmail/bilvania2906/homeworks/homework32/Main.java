package com.gmail.bilvania2906.homeworks.homework32;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Додавання вершин
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        // Додавання ребер
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 3);

        // Виведення графу
        System.out.println("Граф після додавання вершин та ребер:");
        graph.printGraph();

        // Перевірка існування вершини та ребра
        System.out.println("Чи існує вершина 2? " + graph.hasVertex(2));
        System.out.println("Чи існує ребро між 1 та 3? " + graph.hasEdge(1, 3));

        // Видалення вершини
        graph.removeVertex(2);
        System.out.println("Граф після видалення вершини 2:");
        graph.printGraph();
        System.out.println("Чи існує вершина 2? " + graph.hasVertex(2));

        // Видалення ребра
        graph.removeEdge(1, 3);
        System.out.println("Граф після видалення ребра між 1 та 3:");
        graph.printGraph();
        System.out.println("Чи існує ребро між 1 та 3? " + graph.hasEdge(1, 3));
    }
}

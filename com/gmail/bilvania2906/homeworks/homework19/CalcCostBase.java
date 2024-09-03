package com.gmail.bilvania2906.homeworks.homework19;

// Клас розрахунку базової вартості товару
// ЗАВДАННЯ: Виправити код класу.
public class CalcCostBase {

    // Базовий розрахунок вартості товару
    public double calcCost(Product product) {
        return product.getQuota() * product.price;
    }
}


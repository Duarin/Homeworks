package com.gmail.bilvania2906.homeworks.homework19;


// Клас розрахунку вартості товару,
// враховуючи вартість доставки
// ЗАВДАННЯ: Виправити код класу.
// Клас успадковує клас CalcCostBase.
public class CalcCostDelivery implements CalcCostDelivery1 {

    // Вартість доставки
    private static final double deliveryPrice=17;

    // Розрахунок вартості товару,
    // з урахуванням вартості доставки
    @Override
    public double calcCost(Product product) {
        return product. price
                + deliveryPrice;
    }
}


package ru.netology.sqr;

public class SQRService {
    public int count(int start, int end) {
// Переменная для хранения кол-ва значений из диапазона, удовлетворяющих условию
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= start) {
                if (i * i <= end) {
                    counter++;
                } else {
                    return counter;
                }
            }
        }
        return counter;
    }
}

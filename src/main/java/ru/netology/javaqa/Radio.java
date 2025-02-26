package ru.netology.javaqa;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;

    public Radio() {
        this.currentRadioStationNumber = 0; // Начинаем с первой станции
        this.currentVolume = 0; // Начинаем с минимальной громкости
    }

    public void setMaxNumberStation() {
        currentRadioStationNumber = 9; // Устанавливаем максимальную станцию
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void nextStationNumber() {
        if (currentRadioStationNumber != 9) {
            currentRadioStationNumber++; // Переход к следующей станции
        } else {
            currentRadioStationNumber = 0; // Если достигли максимума, возвращаемся к 0
        }
    }

    public void prevStationNumber() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber--; // Переход к предыдущей станции
        } else {
            currentRadioStationNumber = 9; // Если на первой станции, переходим к максимальной
        }
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1; // Увеличиваем громкость
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1; // Уменьшаем громкость
        }
        return currentVolume;
    }
}
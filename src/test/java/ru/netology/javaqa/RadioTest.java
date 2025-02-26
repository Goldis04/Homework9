package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldSetMaxRadioStationNumber() {
        Radio radio = new Radio();
        radio.setMaxNumberStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberTest() {
        Radio radio = new Radio();
        radio.nextStationNumber(); // Переход к следующей станции
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNumberTest2() {
        Radio radio = new Radio();
        radio.setMaxNumberStation(); // Устанавливаем максимальную станцию
        radio.nextStationNumber(); // Переход к следующей станции
        int expected = 0; // Следующая станция после 9
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNumberTest() {
        Radio radio = new Radio();
        radio.nextStationNumber(); // Переход к следующей станции
        radio.prevStationNumber(); // Переход к предыдущей станции
        int expected = 0; // Возвращаемся к 0
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();
        int expected = 1;
        int actual = radio.increaseVolume(); // Увеличиваем громкость
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTest() {
        Radio radio = new Radio();
        radio.increaseVolume(); // Увеличиваем громкость до 1
        int expected = 0;
        int actual = radio.decreaseVolume(); // Уменьшаем громкость
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeInNullTest() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.decreaseVolume(); // Уменьшаем громкость, когда она уже 0
        Assertions.assertEquals(expected, actual);
    }
}
package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void CurrentRadioStationNumber1() {
        Radio next = new Radio();

        next.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = next.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentRadioStationNumber2() {
        Radio next = new Radio();

        next.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = next.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio next = new Radio();

        next.increaseVolume(100);

        int expected = 1;
        int actual = next.increaseVolume(0);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeTest() {
        Radio next = new Radio();

        next.decreaseVolume(100);

        int expected = 31;
        int actual = next.decreaseVolume(30);

        Assertions.assertEquals(expected, actual);

    }
}
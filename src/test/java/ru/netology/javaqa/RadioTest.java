package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void maxRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentRadioStationNumber3() {
        Radio radio = new Radio();
        radio.nextStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNextStation() {
        Radio radio = new Radio();
       radio.nextStation(8);
       int expected = 9;
       int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevRadio() {
        Radio radio = new Radio();
        radio.prevStation(4);
        int expected = 3;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioNull () {
        Radio radio = new Radio();
        radio.prevStation(0);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio next = new Radio();
        next.increaseVolume(100);
        int expected = 29;
        int actual = next.increaseVolume(30);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolumeTest1() {
        Radio radio = new Radio();
        radio.decreaseVolume(100);
        int expected = 5;
        int actual = radio.decreaseVolume(4);
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void decreaseVolumeTest2() {
        Radio next = new Radio();
        next.decreaseVolume(100);
        int expected = 0;
        int actual = next.decreaseVolume(0);
        Assertions.assertEquals(expected, actual);

    }
}
package ru.netology.javaqa;

public class Radio {

    private int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {

        return currentRadioStationNumber;
    }
    public void setMaxRadioStation() {
        currentRadioStationNumber = 9;
    }

    public void nextStation (int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber > 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = newCurrentRadioStationNumber +1;
        }

    }
    public void prevStation(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber > 0){
            currentRadioStationNumber = newCurrentRadioStationNumber -1;
        } else {
            currentRadioStationNumber = 9;
        }
    }
    public int increaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

}
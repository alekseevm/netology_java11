package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void volumePlusOne() {
        Radio radio = new Radio(11);
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMinusOne() {
        Radio radio = new Radio(11);
        radio.setCurrentVolume(9);
        radio.decreaseVolume();
        int expected = 8;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeOverMax() {
        Radio radio = new Radio(11);
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeOverMin() {
        Radio radio = new Radio(11);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationPlusOne() {
        Radio radio = new Radio(11);
        radio.setCurrentRadioStation(3);
        radio.nextStation();
        int expected = 4;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationMinusOne() {
        Radio radio = new Radio(11);
        radio.setCurrentRadioStation(3);
        radio.prevStation();
        int expected = 2;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationOverMax() {
        Radio radio = new Radio(11);
        radio.setCurrentRadioStation(10);
        radio.nextStation();
        int expected = 0;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationOverMin() {
        Radio radio = new Radio(11);
        radio.setCurrentRadioStation(0);
        radio.prevStation();
        int expected = 10;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationOverRangeMax() {
        Radio radio = new Radio(11);
        radio.setCurrentRadioStation(12);
        int expected = 0;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationOverRangeMin() {
        Radio radio = new Radio(11);
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DefaultRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }
}

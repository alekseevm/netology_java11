package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
@Test
    public void volumePlusOne() {
    Radio radio = new Radio();
    radio.setCurrentVolume(9);
    radio.increaseVolume();
    int expected = 10;
    int actual = radio.currentVolume;
    Assertions.assertEquals(expected, actual);
}

@Test
public void volumeMinusOne() {
    Radio radio = new Radio();
    radio.setCurrentVolume(9);
    radio.decreaseVolume();
    int expected = 8;
    int actual = radio.currentVolume;
    Assertions.assertEquals(expected, actual);
}

    @Test
    public void volumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeOverMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationPlusOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.nextStation();
        int expected = 4;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationMinusOne() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.prevStation();
        int expected = 2;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationOverMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationOverTarget() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        int expected = 9;
        int actual = radio.maxRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationMinTarget() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.minRadioStation;
        Assertions.assertEquals(expected, actual);
    }
}

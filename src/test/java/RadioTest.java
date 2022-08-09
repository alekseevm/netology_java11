import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
@Test
    public void increaseVolumePlusOne() {
    Radio radio = new Radio();
    radio.currentVolume(8);
    radio.increaseVolume();
    int expected = 9;
    int actual = radio.currentVolume;
    Assertions.assertEquals(expected, actual);

}
}

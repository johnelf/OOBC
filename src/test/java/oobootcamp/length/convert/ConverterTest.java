package oobootcamp.length.convert;

import oobootcamp.length.Length;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {
    @Test
    public void shouldConvertOneMeterTo1000Millimeters() {
        assertEquals(Converter.convert(new Length("1M")), new Length("1000MM"));
    }

    @Test
    public void shouldConvertOneCentimeterTo10Millimeters() {
        assertEquals(Converter.convert(new Length("1CM")), new Length("10MM"));
    }

    @Test
    public void shouldConvert0dot1CentimeterTo1Millimeters() {
        assertEquals(Converter.convert(new Length("0.1CM")), new Length("1MM"));
    }

    @Test
    public void shouldConvert0dot0001MeterTo0dot1Millimeter() {
        assertEquals(Converter.convert(new Length("0.0001M")), new Length("0.1MM"));
    }
}

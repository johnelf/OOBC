package oobootcamp.length;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthEquationTest {

    @Test
    public void invalidInputShouldHaveNullValue() {
        Length actual = new Length("1#3CM");

        assertNull(actual.getLength());
        assertNull(actual.getUnit());
    }

    @Test
    public void validInputShouldHaveValueAndUnitSetCorrectly() {
        Length actual = new Length("13CM");
        Double expected = 13.00;
        assertEquals(actual.getLength(), expected);
    }

    @Test
    public void oneMeterShouldEqualTo100Centimeters() {
        Length actual = new Length("1M");
        Length expected = new Length("100CM");

        assertTrue(actual.equals(expected));
    }

    @Test
    public void oneMeterShouldEqualTo1000Millimeters() {
        Length actual = new Length("1M");
        Length expected = new Length("1000MM");

        assertTrue(actual.equals(expected));
    }

    @Test
    public void oneCentimeterShouldEqualTo10Millimeters() {
        Length actual = new Length("1CM");
        Length expected = new Length("10MM");

        assertTrue(actual.equals(expected));
    }

    @Test
    public void oneMilliMeterShouldEqualTo0dot001Meter() {
        Length actual = new Length("1MM");
        Length expected = new Length("0.001M");

        assertTrue(actual.equals(expected));
    }

    @Test
    public void oneCentimeterShouldEqualTo0dot01Meter() {
        Length actual = new Length("1CM");
        Length expected = new Length("0.01M");

        assertTrue(actual.equals(expected));
    }

}

package oobootcamp.length;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthCalculationTest {
    @Test
    public void oneMeterAddOneMeterShouldEqualToTwoMeters() {
        assertEquals(new Length("1M").add(new Length("1M")), new Length("2M"));
    }

    @Test
    public void oneMeterAddOneCentimeterShouldEqualTo1dot01Meters() {
        assertEquals(new Length("1M").add(new Length("1CM")), new Length("1.01M"));
    }

    @Test
    public void twoMetersMinusOneMeterShouldEqualToOneMeter() {
        assertEquals(new Length("2M").minus(new Length("1M")), new Length("1M"));
    }

    @Test
    public void oneMeterMinus50CentimetersShouldEqualTo0dot5Meter() {
        assertEquals(new Length("1M").minus(new Length("50CM")), new Length("0.5M"));
    }

    @Test
    public void oneMeterMulti3ShouldEqualTo3Meters() {
        assertEquals(new Length("1M").multiply(3), new Length("3M"));
    }

    @Test
    public void oneMeterDivide4ShouldEqualTo25Centimeters() {
        assertEquals(new Length("1M").divide(4), new Length("0.25M"));
    }
}

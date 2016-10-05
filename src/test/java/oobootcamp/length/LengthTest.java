package oobootcamp.length;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {

    @Test
    public void oneMeterShouldEqualTo10Centimeter() {
        assertThat(new Length("1M"), is(new Length("10CM")));
    }


}

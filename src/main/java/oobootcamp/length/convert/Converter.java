package oobootcamp.length.convert;

import oobootcamp.length.Length;

public class Converter {

    public static Length convert(Length length) {
        if (length.getUnit().equals("M")) {
            Double value = length.getLength() * 1000;
            return new Length(value + "MM");
        } else if (length.getUnit().equals("CM")) {
            Double value = length.getLength() * 10;
            return new Length(value + "MM");
        } else {
            return new Length(length.getLength() + "MM");
        }
    }
}

package oobootcamp.length;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Length {

    final private String unit;
    final private Double length;

    public Length(String length) {

        Pattern compile = Pattern.compile("^(\\d+\\.?\\d*)(M|CM|MM)$");
        Matcher matcher = compile.matcher(length);
        if (matcher.matches()) {
            this.length = Double.parseDouble(matcher.group(1));
            this.unit = matcher.group(2);
        } else {
            this.length = null;
            this.unit = null;
        }
    }

    public Length convert() {
        if (getUnit().equals("M")) {
            Double value = getLength() * 1000;
            return new Length(value + "MM");
        } else if (getUnit().equals("CM")) {
            Double value = getLength() * 10;
            return new Length(value + "MM");
        } else {
            return new Length(getLength() + "MM");
        }
    }

    public String getUnit() {
        return unit;
    }

    public Double getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof Length) {
            Double first = ((Length) obj).convert().getLength();
            Double second = this.convert().getLength();
            return first.compareTo(second) == 0;
        }
        return super.equals(obj);
    }

    public Length add(Length length) {
        Double first = length.convert().getLength();
        Double second = this.convert().getLength();
        return new Length(first + second + "MM");
    }

    public Length minus(Length length) {
        Double first = this.convert().getLength();
        Double second = length.convert().getLength();
        Double result = first - second;
        return new Length(result + "MM");
    }

    public Length multiply(Integer times) {
        return new Length(length * times + unit);
    }

    public Length divide(Integer divisor) {
        return new Length(length / divisor + unit);
    }
}

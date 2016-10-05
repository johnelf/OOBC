package oobootcamp.length;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Length {

    final private Double length;
    final private String unit;

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
            Double first;
            Double second;
            if (((Length) obj).getUnit().equals("M")) {
                first = ((Length) obj).getLength() * 1000;
            } else if (((Length) obj).unit.equals("CM")){
                first = ((Length) obj).getLength() * 10;
            } else {
                first = ((Length) obj).getLength();
            }

            if (this.getUnit().equals("M")) {
                second = this.getLength() * 1000;
            } else if (this.getUnit().equals("CM")) {
                second = this.getLength() * 10;
            } else {
                second = this.getLength();
            }

            return first.compareTo(second) == 0;
        }
        return super.equals(obj);
    }
}

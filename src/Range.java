public class Range {

    private double max;
    private double min;
    private String unit;

    public Range(double max , double min , String unit) throws InvalidRangeException{
        if ( max <= min){
            throw new InvalidRangeException("the maximum can't be less or equal than the minimum value");
        }
        this.max = max;
        this.min = min;
        this.unit = unit;
    }

    public boolean inRange(double val){
        return val <= max && val >= min;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}

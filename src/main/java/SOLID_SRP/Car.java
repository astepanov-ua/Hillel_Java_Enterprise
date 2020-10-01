package SOLID_SRP;
public class Car {
    private String type;

    private boolean isClean = false;
    private boolean isWashed = false;
    private boolean isChecked = false;
    public Car(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public boolean isWashed() {
        return isWashed;
    }

    public void setWashed(boolean washed) {
        isWashed = washed;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    @Override
    public String toString() {
        return "Car{" +
        "type='" + type + '\'' +
        ", isClean=" + isClean +
        ", isWashed=" + isWashed +
        ", isChecked=" + isChecked +
        '}';
    }
}




package $4_LopVaDoiTuongTrongJava.BaiTap.XayDungLopFan;

public class Fan {
    private static final int SLOW = 1;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return speed + ", " + color + ", và " + radius + " - fan is on";
        }
        return color + ", " + radius + " - fan is off";
    }
}

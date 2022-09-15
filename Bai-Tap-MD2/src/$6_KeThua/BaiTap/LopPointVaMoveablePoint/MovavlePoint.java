package $6_KeThua.BaiTap.LopPointVaMoveablePoint;

public class MovavlePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;


    public MovavlePoint(float x, float y, float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovavlePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovavlePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] setSpeed(float xSpeed, float ySpeed) {
        float[] arr = {getxSpeed(), getySpeed()};
        return arr;
    }

    public MovavlePoint movavlePoint() {
        float x = super.getX();
        float y = super.getY();
        x += xSpeed;
        y += ySpeed;
        setX(x);
        setY(y);
        return this;
    }

    @Override
    public String toString() {
        return "MovavlePoint{ x=" + getX()+ "y="+getY()+
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}

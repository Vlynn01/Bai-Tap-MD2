package $6_KeThua.BaiTap.LopPoint2DVaLopPoint3D;

public class Poind3D extends Point2D {
    float z = 0.0f;

    public Poind3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Poind3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ() {
        float[] array = {this.getX(), this.getY(), this.getZ()};
        return array;
    }

    @Override
    public String toString() {
        return "Poind3D{" +
                "x=" + this.getX() +
                "y=" + this.getY() +
                "z=" + getZ() +
                '}';
    }
}

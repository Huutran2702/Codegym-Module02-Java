public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = new float[3];
        array[0] = super.getX();
        array[1] = super.getY();
        array[2] = z;
        return array;
    }

    @Override
    public String toString() {
        return "Point3D {" +
                "z=" + z +
                " } " + super.toString();
    }
}

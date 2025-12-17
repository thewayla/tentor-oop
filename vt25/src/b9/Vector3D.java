package b9;

import java.util.Arrays;

public class Vector3D {
    private final double[] values;

    public enum Index {
        X, Y, Z;
    }

    public Vector3D(double[] values) {
        if (values.length != 3) throw new IllegalArgumentException();
        this.values = Arrays.copyOf(values, 3);
    }

    public Vector3D(double x, double y, double z) {
        this.values = new double[]{x, y, z};
    }

    public double[] getValues() {
        return Arrays.copyOf(values,3);
    }

    public double get(Index index) {
        switch (index) {
            case X -> {
                return values[0];
            }
            case Y -> {
                return values[1];
            }
            case Z -> {
                return values[2];
            }
        }
        return 0;
    }

    public double length() {
        return Math.sqrt(
                        (Math.pow(this.values[0], 2)
                        +Math.pow(this.values[1], 2)
                        +Math.pow(this.values[2], 2)));
    }

    public Vector3D add(Vector3D other) {
        return add(this, other);
    }

    public static Vector3D add(Vector3D v1, Vector3D v2) {
        double newX = v1.values[0] + v2.values[0];
        double newY = v1.values[1] + v2.values[1];
        double newZ = v2.values[2] + v2.values[2];

        return new Vector3D(newX, newY, newZ);
    }

    @Override
    public String toString() {
        return "["+this.values[0]+", "+this.values[1]+", "+values[2]+"]";
    }
}

package DangTien_3123580050;

public class Vector3D extends Point3D {

    public Vector3D(double x, double y, double z){
        super(x, y, z);
    }

    // Tích vô hướng
    public double dot(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    // Tích có hướng
    public Vector3D cross(Vector3D v) {
        return new Vector3D(
            this.y * v.z - this.z * v.y,
            this.z * v.x - this.x * v.z,
            this.x * v.y - this.y * v.x
        );
    }

    // Cộng Vector
    public Vector3D add(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    // Trừ Vector
    public Vector3D subtract(Vector3D v) {
        return new Vector3D(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    // Kiểm tra Vector 0
    public boolean isZero() {
        return Math.abs(x) < 1e-9 && Math.abs(y) < 1e-9 && Math.abs(z) < 1e-9;
    }
}

package DangTien_3123580050;

public class Point3D {
    protected double x;
    protected double y;
    protected double z;

    public Point3D(double x, double y, double z) {
      this.x = x;
      this.y = y;
      this.z = z;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getZ(){
        return z;
    }

    @Override
    public String toString() {
      return "( x: " + this.x + ", y: " + this.y + ", z: " + this.z + " )";
    }
}



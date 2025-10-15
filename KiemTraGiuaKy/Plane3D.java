package DangTien_3123580050;

public class Plane3D {
    private double a; 
    private double b;
    private double c;
    private double d;
    private Vector3D normal;

    public Plane3D(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.normal = new Vector3D(a, b, c);
    }
 
    public Line3D intersection(Plane3D other) {
        Vector3D u = this.normal.cross(other.normal);

        if (u.isZero()) {
            System.out.println("Hai mặt phẳng song song hoặc trùng nhau — không có giao tuyến duy nhất!");
            return null;
        }

        double A1 = this.a;
        double B1 = this.b;
        double C1 = this.c; 
        double D1 = this.d;

        double A2 = other.a;
        double B2 = other.b;
        double C2 = other.c;
        double D2 = other.d;

        double det = A1 * B2 - A2 * B1; // Tính định thức
        double x0;
        double y0;
        double z0 = 0;

        if (Math.abs(det) > 1e-9) {
            x0 = (B1 * (D2) - B2 * (D1)) / det;
            y0 = (A2 * (D1) - A1 * (D2)) / det;
        } else {
            y0 = 0;
            double det2 = A1 * C2 - A2 * C1;
            if (Math.abs(det2) < 1e-9) {
                System.out.println("Không thể tìm điểm giao (trường hợp đặc biệt).");
                return null;
            }
            x0 = (C1 * (D2) - C2 * (D1)) / det2;
            z0 = (A2 * (D1) - A1 * (D2)) / det2;
        }

        Point3D P = new Point3D(x0, y0, z0);
        return new Line3D(P, u);
    }   
}
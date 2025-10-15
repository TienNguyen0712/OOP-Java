package DangTien_3123580050;

public class Line3D {
    private Point3D point;
    private Vector3D direction;

    public Line3D(Point3D point, Vector3D direction) {
        this.point = point;
        this.direction = direction;
    }

    public Point3D getPoint() {
        return point;
    }

    public Vector3D getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return String.format(
            "x = %.2f + %.2ft\n" +
            "y = %.2f + %.2ft\n" +
            "z = %.2f + %.2ft",
            point.x, direction.x,
            point.y, direction.y,
            point.z, direction.z
        );
    }
}

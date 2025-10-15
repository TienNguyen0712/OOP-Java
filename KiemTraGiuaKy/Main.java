package DangTien_3123580050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap he so mat phang P1 (a1 b1 c1 d1):");
        Plane3D P1 = new Plane3D(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Nhap he so mat phang P2 (a2 b2 c2 d2):");
        Plane3D P2 = new Plane3D(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        Line3D giaoTuyen = P1.intersection(P2);
        if (giaoTuyen != null) {
            System.out.println("\n--- Ket qua ---");
            System.out.println("Vector chi phuong u = " + giaoTuyen.getDirection());
            System.out.println("Diem M thuoc giao tuyen = " + giaoTuyen.getPoint());
            System.out.println("Phuong trinh giao tuyen:");
            System.out.println(giaoTuyen);
        }
    }
}

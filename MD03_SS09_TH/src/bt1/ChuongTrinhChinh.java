package bt1;

import java.util.Random;

public class ChuongTrinhChinh {
    public static void main(String[] args) {
        Random random = new Random();

        // Tạo một mảng các hình
        Resizeable[] hinhArray = new Resizeable[3];
        hinhArray[0] = new Circle(5);
        hinhArray[1] = new Rectangle(3, 4);
        hinhArray[2] = new Square(5);

        // Tăng kích thước và hiển thị diện tích trước và sau
        for (Resizeable hinh : hinhArray) {
            double dienTichTruoc = hinh.getArea();
            System.out.println("Diện tích trước khi tăng kích thước: " + dienTichTruoc);

            double tiLeNgauNhien = random.nextInt(100) + 1;
            hinh.resize(tiLeNgauNhien);

            double dienTichSau = hinh.getArea();
            System.out.println("Diện tích sau khi tăng kích thước: " + dienTichSau);
            System.out.println();
        }
    }
}
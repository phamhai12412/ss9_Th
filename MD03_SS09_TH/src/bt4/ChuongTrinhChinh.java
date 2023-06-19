package bt4;

public class ChuongTrinhChinh {
    public static void main(String[] args) {
        // Tạo đối tượng HinhChuNhat
        HinhChuNhat hinhChuNhat = new HinhChuNhat("Xanh", 5, 10);
        hinhChuNhat.hienThi();
        double dienTichHinhChuNhat = hinhChuNhat.tinhDienTich();
        System.out.println("Diện tích Hình chữ nhật: " + dienTichHinhChuNhat);

        // Tạo đối tượng HinhTron
        HinhTron hinhTron = new HinhTron("Đỏ", 7);
        hinhTron.hienThi();
        double dienTichHinhTron = hinhTron.tinhDienTich();
        System.out.println("Diện tích Hình tròn: " + dienTichHinhTron);
    }
}
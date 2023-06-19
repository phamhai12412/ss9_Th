package bt4;

abstract class Hinh {
    private String mauSac;

    // Constructor
    public Hinh(String mauSac) {
        this.mauSac = mauSac;
    }

    // Getter và Setter
    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    // Phương thức trừu tượng tính diện tích
    public abstract double tinhDienTich();

    // Hiển thị màu sắc
    public void hienThi() {
        System.out.println("Màu sắc: " + mauSac);
    }
}
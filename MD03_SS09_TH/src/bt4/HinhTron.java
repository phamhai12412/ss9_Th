package bt4;

class HinhTron extends Hinh {
    private double banKinh;

    // Constructor
    public HinhTron(String mauSac, double banKinh) {
        super(mauSac);
        this.banKinh = banKinh;
    }

    // Getter và Setter
    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    // Triển khai phương thức tinhDienTich() cho HinhTron
    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }


}